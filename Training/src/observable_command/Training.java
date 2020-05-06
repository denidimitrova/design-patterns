package observable_command;

import java.util.concurrent.TimeUnit;

public class Training {

	public static void main(String[] args) {


    //setting the participants in the training
    Instructor instructor = new Instructor("Ryan");

    Pacesetter pacesetter = new Pacesetter("Jacob");

    Viewer viewer_1 = new Viewer();
    Viewer viewer_2 = new Viewer();
    Viewer viewer_3 = new Viewer();

    instructor.subscribe(pacesetter);

    pacesetter.subscribe(viewer_1);
    pacesetter.subscribe(viewer_2);
    pacesetter.subscribe(viewer_3);

    System.out.println();

    //setting and execution of commands
    instructor.setExercise(new DownExercise());
    instructor.completeExercise();

    //delays the completion of the other exercise by 30 seconds
        try {
             TimeUnit.SECONDS.sleep(30);
             System.out.println("The exercise will change in 30 seconds!");

            } catch (InterruptedException e) {
                e.printStackTrace();
        }

        System.out.println();

        instructor.setExercise(new UpExercise());
        instructor.completeExercise();
}
}