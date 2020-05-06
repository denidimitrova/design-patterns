package observable_command;

public interface IInstructor {
	
    public void subscribe(IPacesetter pacesetter);
	
	public void unsubscribe(IViewer viewer);
	
	public void notifyPacesetter();
	
	public String getName();
	
	public IExercise getExercise() ;
	
	public void setExercise(IExercise exercise);

	void completeExercise();

}
