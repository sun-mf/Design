package Decorator;

public class Test {
	
	public static void main(String[] args) {
		ItemBase item = new ItemBase();
		FrameDecorator frame = new FrameDecorator(item);
		frame.draw();
		System.out.println( frame.description());
	}
}
