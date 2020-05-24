package factory_mediator_singleton;

public class Bot {
	
private static Bot bot;

//private constructor
	private Bot() {
	}

//getBot
	public static Bot getBot() {
		
//to make sure that there is only one bot
		if(bot == null) {
			
			bot = new Bot();
		}
		return bot;
	}
	
//bot sends a message	
	public void sendMessage() {
		System.out.println("Bot: Cat is a forbidden word!");
	}

//removes a user from the chatroom
	public void removeUser(User user) {
		ChatRoom.removeUser(user);
	}
}