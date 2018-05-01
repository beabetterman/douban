package ssm.douban.service;

public interface IRabbitmqService {
	
	public static String testKey = "direct_queue.key";
	public static String topicKey = "topic.abc";
	
	public void sendData(String queueKey, Object object);
	public void sendDataWithAck(String queueKey, Object object);
	
	
}
