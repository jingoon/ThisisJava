package chapter06_Exercise;

public class ShopService {
	
	private static ShopService sigleton = new ShopService();
	
	public static ShopService getInstance() {
		return sigleton;
	}

	private ShopService() {
		
	}
	
	

}
