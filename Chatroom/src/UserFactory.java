package factory_mediator_singleton;

public class UserFactory extends Factory{
	
	public User createUser(String name)
	{
		return new User(name);
	}

}
