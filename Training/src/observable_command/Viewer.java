package observable_command;

public class Viewer implements IViewer {
	
	//private String name;
	private IPacesetter pacesetter;
	private IExercise currentExercise;

  /*  //Viewer constructor
	public Viewer(String name) {
		this.name = name;
	} */
	
	public Viewer() {
		
	}

	//shows information about the current exercise
	@Override
	public void update() {
		currentExercise = pacesetter.getExercise();
		
		if(currentExercise == null) {
			System.out.println("There is no exercise for completion!");
			return;
		}
		
		System.out.println("Viewer is now " + currentExercise.getName());
	}
	
        //sets the pacesetter for the viewer
	public void setPacesetter(IPacesetter pacesetter) {
		this.pacesetter = pacesetter;
	}
}
