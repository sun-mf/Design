package Design.Singleton;


/*
�̰߳�ȫ����
*/
public class ConcurrencySingleton{
	
	public static ConcurrencySingleton getInstance(){
		
		if(s_instance==null){
			synchronized(ConcurrencySingleton.class){
				if(s_instance == null){
					s_instance = new ConcurrencySingleton();
				}
			}
		}
		return s_instance;
	}	
	
	private static ConcurrencySingleton s_instance;
}