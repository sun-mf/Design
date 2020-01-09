package Observer;


/*
 * @author mf
 * @version 0.0.1
 */
public interface ISubject {

	/*
	 * @param orderObserver �����۲���
	 */
	void registerOrderObserver(IOrderObserver orderObserver);
	
	/*
	 * ȡ��ע��
	 */
	void unregisterOrderObserver(IOrderObserver orderObserver);
	
	/*
	 * @param orderId ����id
	 * @param goodsId ����id
	 */
	void notifyOrder(long orderId, int goodsId);
}
