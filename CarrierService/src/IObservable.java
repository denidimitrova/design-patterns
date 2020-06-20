//interface for the observed carriers
public interface IObservable {
	
	public void subscribe(IObserver observer);
	public void unsubscribe(IObserver observer);
	public void notifyObservers();
	public String getUpdate();
	public IState getState();
	public void setState(IState state);
	public String getName();

}
