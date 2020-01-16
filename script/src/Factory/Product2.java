package Factory;

public class Product2 implements IProduct{

	@Override
	public void eat() {
		System.out.println("eat product2");
	}

	@Override
	public int sell() {
		return 2;
	}

}
