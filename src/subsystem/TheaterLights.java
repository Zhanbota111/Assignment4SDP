package subsystem;

public class TheaterLights {
    public void dim(int level) {
        System.out.println("Theater lights dimming to " + level + "%.");
    }

    public void on() {
        System.out.println("Theater lights turned on full brightness.");
    }
}