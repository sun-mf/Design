package Decorator;

public class ItemBase implements IItem{

	@Override
	public void draw() {
		System.out.println("draw item base");
	}

	@Override
	public String description() {
		return m_des;
	}
	
	private String m_des = "ItemBase";
}
