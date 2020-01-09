package Observer;

import java.util.LinkedList;


public class Panda implements ISubject{	
	
	@Override
	public void registerOrderObserver(IOrderObserver orderObserver) {
		
		m_orderObservers.add(orderObserver);
	}
	
	@Override
	public void notifyOrder(long id, int goodsId) {
		
		OrderInfo order = new OrderInfo();
		order.m_orderId = id;
		order.m_goodsId = goodsId;
		
		for(IOrderObserver observer : m_orderObservers) {
			observer.order(order);
		}
	}
	
	@Override
	public void unregisterOrderObserver(IOrderObserver orderObserver) {
		m_orderObservers.remove(orderObserver);
	}
	
	/*
	 * ∂©µ•π€≤Ï’ﬂ
	 */
	private  LinkedList<IOrderObserver> m_orderObservers = new LinkedList<IOrderObserver>();	
	
}
