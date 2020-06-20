import java.util.ArrayList;
import java.util.List;

public abstract class Carrier implements IContext, IObservable {
	
	public static int CITY = 1;
	public static int COUNTRY = 2;
	public static int INTERNATIONAL = 3;
	protected IState state;
	
	protected List<IObserver> observers = new ArrayList<IObserver>();
	
	protected int level;
	
	protected String name;
	
	protected Carrier nextCarrier;
	
	public void setName(String name) {
		this.name=name;
	}
	

	public String getName() {
		return this.name;
	}
	
	//setting the next carrier to take the order
	public void setNextCarrier(Carrier nextLogger) {
		this.nextCarrier = nextLogger;
	}
	
	//carrier takes the order or refuses to take it
	public void acceptOrder(int level) {
		
		System.out.println("\nOrder with level " + level + " is being processed by " + this.name);
		
		if(this.level >= level) {
			this.handleOrder();
		}
		else if(this.nextCarrier != null) {
			System.out.println(this.name + " can't handle the order.");
			
			this.nextCarrier.acceptOrder(level);
		}
		
	}
	
	abstract protected void handleOrder();

}
