package Factory;

public class Factory2 implements IProductFactory {

	@Override
	public IProduct createProduct() {
		return new Product2();
	}

}
