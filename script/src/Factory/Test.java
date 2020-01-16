package Factory;

public class Test {

	public static void main(String[] args) {
		
		factory = new Factory1();
		IProduct p1 = factory.createProduct();
		p1.eat();
		factory = new Factory2();
		IProduct p2 = factory.createProduct();
		p2.eat();
	}
	
	private static IProductFactory factory;
}
