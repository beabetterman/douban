package ssm.douban.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.rabbitmq.client.Channel;

/*
 * This is for dynamic get connectionFactory, and set features.
 * Get template by prototype. To process the multiple callback results.
 */
@Configuration
public class RabbitmqConfig {

	public static final String EXCHANGE   = "spring-boot-exchange";  
    public static final String ROUTINGKEY = "topic.abc"; 
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    
	@Bean
	public ConnectionFactory myConnectionFactory() {
		CachingConnectionFactory connectionFactory = new CachingConnectionFactory();  
        connectionFactory.setAddresses("127.0.0.1:5672");  
        connectionFactory.setUsername("test");  
        connectionFactory.setPassword("test");  
        connectionFactory.setVirtualHost("/");  
        connectionFactory.setPublisherConfirms(true); //必须要设置  
        return connectionFactory;  
	}
	
	@Bean
	@Scope("prototype")
	public RabbitTemplate myRabbitTemplate() {
		RabbitTemplate template = new RabbitTemplate(myConnectionFactory());
	    return template;
	}
	
	@Bean  
    public DirectExchange defaultExchange() {  
        return new DirectExchange(EXCHANGE);  
    }  
  
    @Bean  
    public Queue queue() {  
        return new Queue("spring-boot-queue", true); //队列持久  
  
    }  
  
    @Bean  
    public Binding binding() {  
        return BindingBuilder.bind(queue()).to(defaultExchange()).with(RabbitmqConfig.ROUTINGKEY);  
    }  
    
    
    // @Bean  
    public SimpleMessageListenerContainer messageContainer() {  
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(myConnectionFactory());  
        container.setQueues(queue());  
        container.setExposeListenerChannel(true);  
        container.setMaxConcurrentConsumers(3);  
        container.setConcurrentConsumers(3);  
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL); //设置确认模式手工确认  
        container.setMessageListener(new ChannelAwareMessageListener() {  
  
            @Override  
            public void onMessage(Message message, Channel channel) throws Exception {  
            	logger.info("In listener");
                byte[] body = message.getBody();  
                logger.info("Get message in topic listener, :"+ new String(message.getBody(), "UTF-8"));
                channel.basicAck(message.getMessageProperties().getDeliveryTag(), false); //确认消息成功消费  
            }
        });  
        return container;  
    }
	
}
