package ssm.douban.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class QueueListener implements MessageListener{
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void onMessage(Message message) {
		String body="" ,header = "";
		try {
			body = new String(message.getBody(), "UTF-8");
			logger.info("Message is :"+message);
			logger.info("Message body information:"+body);
		} catch(Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

}
