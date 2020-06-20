public class IdleState implements IState{
	
    private String stateName = "waiting for a client";
    
    //getter
	public String getStateName() {
		return this.stateName;
	}
	
    //set the state to a carrier
	@Override
	public void applyState(IContext context) {
		context.setState(this);
	}
	
	//default state
	@Override
	public void resetState(IObservable observable) {

	}

}
