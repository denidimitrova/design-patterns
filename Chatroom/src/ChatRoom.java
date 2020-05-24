package factory_mediator_singleton;

import java.util.ArrayList;

public class ChatRoom {
	
	private static ArrayList<User> users = new ArrayList<User>();
	private static Bot bot;
	
//shows message	
	public static void showMessage(User user, String message){
//removed user cannot send messages anymore
		if(!users.contains(user)){
			System.out.println("System info: "+ user.getName()+ " cannot send messages anymore!");
			return;
		}	
		
		System.out.println(user.getName() + ": " + message);
		
//if the bot spots the word cat, it removes the user
		if(bot != null && message.contains("cat")){
			bot.removeUser(user);
			bot.sendMessage();			
		}		
//when a user sends addBot message, a bot is added
		else if(message.equalsIgnoreCase("addBot")){
			bot = Bot.getBot();		
		}
	}
	
//adds user to the chat
	public static void addUser(User user) {
		if(user!= null) {
			users.add(user);
		}
	}
	
//removes user from the chat
	public static void removeUser(User user) {
		
		if(user!= null && users.contains(user)) {
			users.remove(user);
			System.out.println(user.getName() + " has been removed from the chat!");
			
		}
	}

}
