package ssm.douban.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.douban.service.IRabbitmqService;

@Service("rabbitmqService")
public class RabbitmqService implements IRabbitmqService{

	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	
	
	@Override
	public void sendData(String quequeKey, Object object) {
		try {
			logger.info("Get infor : key:" + quequeKey + ", object:"+object);
			amqpTemplate.convertAndSend(quequeKey, object);
		} catch(Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

}
