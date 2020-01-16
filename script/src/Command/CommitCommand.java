package Command;

public class CommitCommand implements ICommand{

	public CommitCommand(File file) {
		m_file = file;
	}
	
	@Override
	public void excute() {
		m_file.commit();
	}

	@Override
	public void undo() {
		m_file.reset();
	}

	
	private File m_file;
}
