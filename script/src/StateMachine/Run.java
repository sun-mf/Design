package StateMachine;

public class Run implements IState {
	
	public Run(StateMachine sm) {
		m_stateMachine = sm;
	}
	
	@Override
	public void playAnimate() {
		System.out.println("Run animate");
		
		m_stateMachine.changeState(new Idle(m_stateMachine));
	}

	@Override
	public void playEffect() {
		System.out.println("Run effect");
		
		m_stateMachine.changeState(new Idle(m_stateMachine));
	}
	
	private StateMachine m_stateMachine;
}
