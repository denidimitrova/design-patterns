package factory_mediator_singleton;

public class User {
	
	   private String name;

//getter
	   public String getName() {
	      return name;
	   }

//setter
	   public void setName(String name) {
	      this.name = name;
	   }

	   public User(String name){
	      this.name  = name;
	   }

//user sends messages
	   public void sendMessage(String message){
	      ChatRoom.showMessage(this,message);
	   }

}
