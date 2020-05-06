package observable_command;

public class UpExercise implements IExercise{

	//constructor
	public UpExercise() {
		
	}

    //sets the name of the command
	@Override
	public String getName() {
		return "up";
	}

    //sets the result of the execution of the command
	@Override
	public void complete() {
		System.out.println("The pacesetter has stood up.");
	}	

       /* //sets the result of the execution of the command
        @Override
        public void show() {
               System.out.println("The instructor has stood up.");
        } */

}
