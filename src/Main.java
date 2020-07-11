import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    // print method
    public static void printExerciseArray (ArrayList<Exercise> exArray) {
        for (Exercise item : exArray) {
            System.out.printf("%n%-30s DURATION: %d seconds. %n------------------------------" +
                    "----------------------%nDESCRIPTION: %s %n%n%n%n", item.name, item.dur, item.desc);
        }
    }


    public static void main(String[] args) {

        // descriptions of exercises for better visibility
        String pushUpDesc = "Place your hands on the floor. Raise up onto your toes so that all\n" +
                "\t\t\t of your body weight is on your hands and your feet. Bend your elbows\n" +
                "\t\t\t and lower your chest down toward the floor. Then, push off the floor\n" +
                "\t\t\t and extend them so that you return to starting position.";

        String planksDesc = "Start on the floor on your hands and knees. Lower your forearms to the\n" +
                "\t\t\t floor with elbows positioned under your shoulders and your hands shoulder\n" +
                "\t\t\t -width apart. Maintain a straight line from heels through the top of your\n" +
                "\t\t\t head, looking down at the floor. Now, tighten your abs and hold.";

        String squatsDesc = "Stand with feet a little wider than shoulder-width apart, hips stacked\n" +
                "\t\t\t over knees, and knees over ankles. Extend arms out straight so they are\n" +
                "\t\t\t parallel with the ground, palms facing down.  Goto a squat and exhale,\n" +
                "\t\t\t then explode back up to standing, driving through heels.";

        String backwardKickDesc = "Get in an all-fours position with your knees and hands on the floor.\n" +
                "\t\t\t Your back is straight. Lift your leg up, and straighten it. Form a \n" +
                "\t\t\t 90 degree angle in the ankle.  Raise your leg with your heel pushing\n" +
                "\t\t\t up and constantly forming a 90 degree angle in between the legs.\n" +
                "\t\t\t Return to the starting position and repeat.";

        String legCurlDesc = "Stand up on, shift your weight to  one feet and pull another heel toward\n" +
                "\t\t\t your buttocks. Stay for 15 seconds, then repeat with your other leg.";

        String sideBackStretchDesc = "Go into standing position, put your hands on your hips and then\n" +
                "\t\t\t stretch with one hand over your head to the opposite side.\n" +
                "\t\t\t Repeat with other hand.";


        // creating objects of exercises
	    Exercise pushUps = new Exercise("Push-ups", pushUpDesc,"floor",30);
        Exercise planks = new Exercise("Planks",planksDesc,"floor",90);
        Exercise squats = new Exercise("Squats",squatsDesc,"stand-up",45);
        Exercise backwardKick = new Exercise("Backward Kick",backwardKickDesc,"floor",60);
        Exercise legCurl = new Exercise("Leg Curl",legCurlDesc,"stand-up",90);
        Exercise sideBackStretch = new Exercise("Sidewards Back Stretch",
                sideBackStretchDesc,"stand-up",60);

        // create ArrayList for print method
        ArrayList<Exercise> exerciseArray = new ArrayList<>(
                Arrays.asList(pushUps,planks, squats, backwardKick, legCurl, sideBackStretch));


        System.out.printf("%n=============================== Using newly created print method " +
                "===============================%n");

        printExerciseArray(exerciseArray); // created above - included for loop



        System.out.printf("%n============================== Using Overridden toSting() " +
                "method of Exercise class ============================%n");

        for (Exercise item : exerciseArray) { // using overridden toString() method of Exercise class
            System.out.println(item);
        }



        // Last part of the code review
        ArrayList<String> floorExercises = new ArrayList<>(); // empty arraylist - floor ex names
        ArrayList<String> floorExercisesLong = new ArrayList<>(); // empty arraylist - long floor ex names
        for (Exercise item : exerciseArray) {
            if (item.pos.equals("floor")) { // pick only floor exercise names
                floorExercises.add(item.name);
                if (item.dur > 60) { // nested if - pick floor exercises last longer than a minute
                    floorExercisesLong.add(item.name);
                }
            }

        }

        // printing floor & long exercises
        System.out.println("Floor exercises are: \n" + floorExercises);
        System.out.println("==============================");
        System.out.println("Long floor exercises are: \n" + floorExercisesLong);



        // =================================== Additional points =============================

        System.out.printf("%n%n=====================================" +
                "==== Additional points ========================================%n%n");

        ArrayList<Exercise > exNames = new ArrayList<>(Arrays.asList(pushUps, squats, planks));
        IntervalWorkout objOne = new IntervalWorkout(exNames, 4, 30);

        objOne.printReport();
        
    }
}
