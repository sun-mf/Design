package Decorator;

public class FrameDecorator implements IItemDecorator {

	public FrameDecorator(IItem item) {
		m_item = item;
	}
	
	@Override
	public void draw() {
		m_item.draw();
		System.out.println("draw frame");
	}

	@Override
	public String description() {
		return m_item.description() + "frame des";
	}

	private IItem m_item;
}
