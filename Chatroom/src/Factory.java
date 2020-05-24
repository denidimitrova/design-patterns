package factory_mediator_singleton;

public abstract class Factory {
	
	protected UserFactory userFactory;
	
	public User createUser(String name)
	{
		return userFactory.createUser(name);		
	}

}
