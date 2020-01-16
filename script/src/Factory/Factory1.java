package Factory;

public class Factory1 implements IProductFactory{

	@Override
	public IProduct createProduct() {
		return new Product1();
	}

}
