package command.remoteUndo;

public class CeilingFan {
    String location = "";
    int level;
    public static final int ON = 2;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on() {
        // turns the ceiling fan on to high
        level = ON;
        System.out.println(location + " ceiling fan is on");

    }

    public void off() {
        // turns the ceiling fan off
        level = 0;
        System.out.println(location + " ceiling fan is off");
    }

    public int getSpeed() {
        return level;
    }
}
