public class PreparationState implements IState {

	private String stateName = "preparing the order";
	
	//set carrier state
	@Override
	public void applyState(IContext context) {
		context.setState(this);
	}
	
	//set default state
	public void resetState(IObservable observable) {
		IdleState idleState = new IdleState();
		
		observable.setState(idleState);
	}
	
	public String getStateName() {
		return this.stateName;
	}

}