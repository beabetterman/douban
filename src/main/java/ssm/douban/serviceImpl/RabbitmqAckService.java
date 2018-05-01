package ssm.douban.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.douban.rabbitmq.RabbitmqSender;
import ssm.douban.service.IRabbitmqService;

@Service("myRabbitmqService")
public class RabbitmqAckService implements IRabbitmqService{

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RabbitmqSender rabbitmqSender;
	
	
	@Override
	public void sendData(String queueKey, Object object) {
		
	}

	@Override
	public void sendDataWithAck(String queueKey, Object object) {
		logger.info("In RabbitmqAckService.");
		rabbitmqSender.sendMessage(queueKey, object);
	}
	

}
