package Command;

public class Test {
	public static void main(String[] args) {
		CommitCommand cmd = new CommitCommand(new File());
		cmd.excute();
		cmd.undo();
	}	
}
