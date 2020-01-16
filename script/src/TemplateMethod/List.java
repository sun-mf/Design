package TemplateMethod;

public class List<T extends Object> {

	public void sort() {
		
	}
	
	protected int compare(T lhs, T rhs) {
		return 1;
	}
	
}
