public class Exercise {

    String name; // exercise name
    String desc; // exercise description
    String pos; // "floor" or "stand-up"
    int dur; // exercise duration in seconds


    //constructor
    public Exercise (String name, String desc, String pos, int dur) {
        this.name = name;
        this.desc = desc;
        this.pos = pos;
        this.dur = dur;
    }


    // another solution for printing
    @Override
    public String toString() {
        return String.format("%n%-30s DURATION: %d seconds. %n------------------------------" +
                "----------------------%nDESCRIPTION: %s %n%n%n%n", name, dur, desc);
    }

}
