
public interface IState {
	
	public void applyState(IContext context);
	public String getStateName();
	public void resetState(IObservable observable);

}
