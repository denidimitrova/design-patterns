package observable_command;

public class Instructor implements IInstructor{
	
	private String name;
	private IPacesetter pacesetter;
	private IExercise currentExercise;

	
        //Instructor constructor
	public Instructor(String name) {
		this.name = name;
	}
	
        //execution of the command
	@Override
	public void completeExercise() {
		currentExercise.complete();
		notifyPacesetter();
	}
	
        //subscritption of a pacesetter to the instructor
	@Override
	public void subscribe(IPacesetter pacesetter) {
		pacesetter.setInstructor(this);
	}

        //unsubscription ?
	@Override
	public void unsubscribe(IViewer viewer) {
		this.pacesetter = null;
	}
	
        //notification of the pacesetter
	@Override
	public void notifyPacesetter() {
		pacesetter.update();
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public IExercise getExercise() {
		return currentExercise;
	}
	
	@Override
	public void setExercise(IExercise exercise) {
		currentExercise = exercise;
	}

}
