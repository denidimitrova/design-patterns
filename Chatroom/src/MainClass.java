package factory_mediator_singleton;

public class MainClass {
	public static void main(String[] args) {
	
	Factory factory = new UserFactory();
	User userOne = factory.createUser("Josh");
	User userTwo = factory.createUser("Kate");
	User userThree = factory.createUser("Liam");

	ChatRoom.addUser(userOne);
	ChatRoom.addUser(userTwo);
	ChatRoom.addUser(userThree);
		
	userOne.sendMessage("Hi!");
	userTwo.sendMessage("Hello!");
	userThree.sendMessage("Hi y'all!");

	
	//there is no bot in the chat
	userOne.sendMessage("What do you think about cats?");
	//activates the bot in the chat
	userTwo.sendMessage("addBot");
	//the bot will remove whoever uses the word cat
	userThree.sendMessage("I love them! I even have a cat at home.");
	//Pesho not in chat anymore
	userThree.sendMessage("His name is Max.");

    }
}
