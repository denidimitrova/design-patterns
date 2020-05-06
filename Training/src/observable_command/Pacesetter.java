package observable_command;

import java.util.ArrayList;

public class Pacesetter implements IPacesetter {
	
	private String name;
	 private IExercise currentExercise;
	 private IInstructor instructor;
	 private ArrayList<IViewer> viewers= new ArrayList<IViewer>();
	
    //constructor
	public Pacesetter(String name) {
		this.name = name;
	}
	
       //sets the instructor for the pacesetter to follow
       @Override
	public void setInstructor(IInstructor instructor) {
	     this.instructor = instructor;
	}

       //subscription of a viewer to the pacesetter
	@Override
	public void subscribe(IViewer viewer) {
		this.viewers.add(viewer);
		viewer.setPacesetter(this);
	}

       //unsubscription of a viewer to the pacesetter
	@Override
	public void unsubscribe(IViewer viewer) {
		this.viewers.remove(viewer);
	}
       
       //sets the current exercise
	@Override
	public void setExercise(IExercise exercise) {
		currentExercise = exercise;
		notifyViewers();
	}

       //notification of the viewers for the current exercise
	@Override
	public void update() {
		this.currentExercise = instructor.getExercise();
		System.out.println("The pacesetter is + currentExercise.getName()");
		notifyViewers();
	}

	//notification of the viewers for a change in commands
	@Override
	public void notifyViewers() {
		for(IViewer viewer: viewers) {
			viewer.update();
		}
	}

       //execution of the command
	@Override
       public void completeExercise(IExercise exercise){
             exercise.complete();
       }

       //returns the name of the current exercise
	@Override
       public IExercise getExercise() {
   	     return currentExercise;
       }
 
       //sets the name of the pacesetter
       @Override 
       public void setName(String name) {
	    this.name = name;
       }

       //returns the name of the pacesetter	
       @Override
       public String getName(){
	    return this.name;
       }

}
