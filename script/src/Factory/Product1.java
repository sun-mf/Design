package Factory;

public class Product1 implements IProduct {

	@Override
	public void eat() {
		System.out.println("eat product1");
	}

	@Override
	public int sell() {
		return 1;
	}

}
