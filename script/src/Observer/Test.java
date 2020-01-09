package Observer;

public class Test {

	
	public static void main(String[] args) {
		
		
		ISubject platform = new Panda();
		IOrderObserver merchant = new Merchant();		
		
		platform.registerOrderObserver(merchant);
		platform.notifyOrder(123, 456);
	}
}
