package Observer;


/*
 * @author mf
 * @version 0.0.1
 */
public interface ISubject {

	/*
	 * @param orderObserver 订单观察者
	 */
	void registerOrderObserver(IOrderObserver orderObserver);
	
	/*
	 * 取消注册
	 */
	void unregisterOrderObserver(IOrderObserver orderObserver);
	
	/*
	 * @param orderId 订单id
	 * @param goodsId 货物id
	 */
	void notifyOrder(long orderId, int goodsId);
}
