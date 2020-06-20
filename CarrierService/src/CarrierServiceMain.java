public class CarrierServiceMain {
	
public static void main(String[] args) {
		
		Worker worker = new Worker();
		
		Carrier carrierPlovdiv = new CityCarrier();
		Carrier carrierBulgaria = new CountryCarrier();
		Carrier carrierInternational = new InternationalCarrier();
		
		IdleState idleState = new IdleState();
		
		worker.setName("Worker");
		carrierPlovdiv.setName("PLD_Carrier");
		carrierBulgaria.setName("BG_Carrier");
		carrierInternational.setName("INT_Carrier");

		carrierPlovdiv.setNextCarrier(carrierBulgaria);
		carrierBulgaria.setNextCarrier(carrierInternational);
		
		System.out.println("The current state of the carriers is:");
		idleState.applyState(carrierPlovdiv);
		idleState.applyState(carrierBulgaria);
		idleState.applyState(carrierInternational);
		System.out.println("\n");

		
		carrierPlovdiv.subscribe(worker);
		carrierBulgaria.subscribe(worker);
		carrierInternational.subscribe(worker);
		
		System.out.println("State of Order 1 (level 1):");
		carrierPlovdiv.acceptOrder(1);
		System.out.println("\nState of Order 2 (level 2):");
		carrierPlovdiv.acceptOrder(2);
		System.out.println("\nState of Order 3 (level 2):");
		carrierBulgaria.acceptOrder(2);
		System.out.println("\nState of Order 4 (level 3):");
		carrierPlovdiv.acceptOrder(3);
				
	}

}
