package ssm.douban.rabbitmq;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("rabbitmqSender")
public class RabbitmqSender implements RabbitTemplate.ConfirmCallback {
	
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private RabbitTemplate myRabbitTeamplate;
	
	@Autowired
	public RabbitmqSender(RabbitTemplate myRabbitTemplate) {
		this.myRabbitTeamplate = myRabbitTemplate;
		myRabbitTemplate.setConfirmCallback(this);
	}
	
	public void sendMessage(String key, Object message) {
		CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString()); 
		logger.info("Sending message, key:"+key+", id:"+correlationId.getId()+", message:"+message);
		myRabbitTeamplate.convertAndSend(RabbitmqConfig.EXCHANGE, key, message, correlationId);
	}

	@Override
	public void confirm(CorrelationData correlationData, boolean ack, String cause) {
		logger.info("Get from listener:" + correlationData.getId());
		logger.info("ack:"+ack+", cause:"+cause);
	}
	
	

}
