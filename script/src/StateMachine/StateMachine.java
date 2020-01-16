package StateMachine;

public class StateMachine {

	public void changeState(IState state) {
		m_curState = state;
	}
	
	public void playAnimate() {
		m_curState.playAnimate();
	}
	
	public void playEffect() {
		m_curState.playEffect();
	}
	
	private IState m_curState;
}
