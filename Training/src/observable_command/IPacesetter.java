package observable_command;

public interface IPacesetter {
	
	public void setName(String name);
    public String getName();

    public void setInstructor(IInstructor instructor);
    public void completeExercise(IExercise exercise);
    public void setExercise(IExercise exercise);

    public void subscribe(IViewer viewer);
    public void unsubscribe(IViewer viewer);

    public void update();
    public void notifyViewers();

    public IExercise getExercise();

}
