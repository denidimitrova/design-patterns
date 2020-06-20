public class Worker implements IObserver{
	
    private String name;
	
	@Override
	public void update(IObservable carrier) {
		if(carrier.getUpdate() == null) {
			System.out.println("No state.");
			return;
		}
		
		//get order if the carrier is preparing it
		if(carrier.getUpdate().equals("preparing the order"))
		{
			System.out.println(this.getName() + " took a package from " + 
					carrier.getName() + " and headed to the warehouse.");
			carrier.getState().resetState(carrier);		
		}
	}
	
	//getter
	public String getName() {
		return name;
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}


}
