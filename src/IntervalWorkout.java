import java.util.ArrayList;

public class IntervalWorkout {
    ArrayList<Exercise> myExercises;
    int numOfRepetitions;
    int breakTime;

    // constructor
    public IntervalWorkout (ArrayList<Exercise> myExercises, int numOfRepetitions, int breakTime) {
        this.myExercises = myExercises;
        this.numOfRepetitions = numOfRepetitions;
        this.breakTime = breakTime;
    }


    // printing report method
    public void printReport () {
        System.out.println("***************************** \n" +
                "Interval Workout STARTS !!!!\n" +
                "*****************************\n" +
                "=============================");
        for (int i = 1; i < numOfRepetitions; i++ ) {
            System.out.printf("ROUND %d: %n", i);
            for (Exercise item : myExercises) {
                System.out.printf("%s %n", item.name);
            }
            System.out.printf("=============================%n" +
                    "DO THE BREAK (%d SECONDS)%n" +
                    "=============================%n", breakTime);
        }
        System.out.printf("ROUND %d: %n", numOfRepetitions); // last round of exercises
        for (Exercise item : myExercises) {
            System.out.printf("%s %n", item.name);
        }
        System.out.printf("%n*****************************\n" +
                " CONGRATS - YOU ARE DONE !!!\n" +
                "*****************************");
    }
}
