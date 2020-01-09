package Observer;

public class Merchant implements IOrderObserver {

	public void order(OrderInfo order) {
		System.out.println("on oreder id:" + order.m_orderId);
	}
	
}
