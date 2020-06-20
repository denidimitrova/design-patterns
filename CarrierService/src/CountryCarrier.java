public class CountryCarrier extends Carrier{
	
	public CountryCarrier() {
		this.level = Carrier.COUNTRY;
	}

	@Override
	protected void handleOrder() {
		System.out.println(this.name + " has taken the order.");
		
		PreparationState preparationState = new PreparationState();
		
		this.setState(preparationState);
		
		notifyObservers();
	}

	@Override
	public IState getState() {
		return state;
	}

	@Override
	public void setState(IState state) {
		this.state = state;
		System.out.println(this.name + " is now " + this.state.getStateName());
	}

	@Override
	public void subscribe(IObserver observer) {
		this.observers.add(observer);		
	}

	@Override
	public void unsubscribe(IObserver observer) {
		this.observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for(IObserver observer: this.observers) {
			observer.update(this);
		}
	}

	@Override
	public String getUpdate() {
		return this.state.getStateName();
	}

}
