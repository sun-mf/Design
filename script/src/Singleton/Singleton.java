package Singleton;

public class Singleton{	
	
	public static Singleton GetInstance(){		
		if(m_instance == null){
			m_instance = new Singleton();
		}
		return m_instance;
	}
	
	public static void main(String[] args){	
		Singleton.GetInstance();
	}
	
	private static Singleton m_instance;
}