package ssm.douban.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;

import com.rabbitmq.client.Channel;

public class TopicQueueListener implements ChannelAwareMessageListener{
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void onMessage(Message message, Channel channel) throws Exception {
		String body="" ,header = "";
		try {
			// Do business here
			//logger.info("Get message in Listener:" + new String(message.getBody(), "UTF-8"));
			body = new String(message.getBody(), "UTF-8");
			logger.info("Message is :"+message );
			logger.info("key:"+ message.getMessageProperties().getReceivedRoutingKey() + ", id:"+message.getMessageProperties().getDeliveryTag() +", body:" + body);
			
			long gid = message.getMessageProperties().getDeliveryTag();
			channel.basicAck(gid, false);
			
			
		} catch(Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		
		
	}

}
