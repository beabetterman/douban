package ssm.douban.service;

public interface IRabbitmqService {
	
	public static String testKey = "queue.key";
	
	public void sendData(String quequeKey, Object object);
	
	
}
