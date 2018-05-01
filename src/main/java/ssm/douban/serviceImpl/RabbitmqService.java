package ssm.douban.serviceImpl;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.douban.service.IRabbitmqService;

@Service("rabbitmqService")
public class RabbitmqService implements IRabbitmqService, RabbitTemplate.ConfirmCallback{

	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private ConnectionFactory connectionFactory;
	
	@Override
	public void sendData(String queueKey, Object object) {
		try {
			logger.info("Get infor : key:" + queueKey + ", object:"+object);
			amqpTemplate.convertAndSend(queueKey, object);
		} catch(Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}



	@Override
	public void sendDataWithAck(String queueKey, Object object) {
		try {
			
			CorrelationData cdId = new CorrelationData(UUID.randomUUID().toString());
			logger.info("Get infor : key:" + queueKey + ", object:"+object +", id:"+cdId.getId());
			//((CachingConnectionFactory)connectionFactory).setPublisherConfirms(true);
			rabbitTemplate = new RabbitTemplate(connectionFactory);
			rabbitTemplate.setConfirmCallback(this);
			rabbitTemplate.convertAndSend(queueKey, object, cdId);
		} catch(Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}
	
	@Override
	public void confirm(CorrelationData correlationData, boolean arg1, String arg2) {
		logger.info("Get ACK from listener, cdId is :" + correlationData.getId());
	}

}
