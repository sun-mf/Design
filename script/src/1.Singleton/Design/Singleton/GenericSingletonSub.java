package Design.Singleton;



public class GenericSingletonSub extends GenericSingleton {

	protected GenericSingletonSub() {
		System.out.println("GenericSingletonSub");
	}
	
	public static void main(String[] args) {
		GenericSingleton.getInstance(GenericSingletonSub.class);
	}
}
