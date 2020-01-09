package Singleton;

public class Singleton{
	
	private Singleton(){		
		System.out.println("Sturcture!");
	}
	
	private static Singleton m_instance;
	
	public static Singleton GetInstance(){
		
		if(m_instance == null){
					m_instance = new Singleton();
		}
		return m_instance;
	}
	
	public  static void main(String[] args){	
		Singleton.GetInstance();
	}
}