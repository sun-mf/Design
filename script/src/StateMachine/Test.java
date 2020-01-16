package StateMachine;

public class Test {

	public static void main(String[] args) {
		StateMachine sm = new StateMachine();
		Idle idle = new Idle(sm);
		sm.changeState(idle);
		sm.playAnimate();
		sm.playAnimate();
	}
		
}
