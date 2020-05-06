package observable_command;

public class DownExercise implements IExercise{
	
	//constructor
    public DownExercise() {
		
	}

    //sets the name of the command
	@Override
	public String getName() {
		return "down";
	}
	
     //sets the result of the execution of the command
	@Override
	public void complete() {
		System.out.println("The pacesetter has lied down.");
	}

      /*  //sets the result of the execution of the command
        @Override
        public void show() {
               System.out.println("The instructor has lied down.");
        } */

}
