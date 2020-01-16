package StateMachine;

public class Idle implements IState {

	public Idle(StateMachine sm) {
		m_stateMachine = sm;
	}
	
	@Override
	public void playAnimate() {
		System.out.println("Idle animate");
		m_stateMachine.changeState(new Run(m_stateMachine));
	}

	@Override
	public void playEffect() {
		System.out.println("Idle effect");
		m_stateMachine.changeState(new Run(m_stateMachine));
	}

	
	private StateMachine m_stateMachine;
}
