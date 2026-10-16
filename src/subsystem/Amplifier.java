package subsystem;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier turned on.");
    }

    public void setDvdPlayer(DvdPlayer dvd) {
        System.out.println("Amplifier input set to DVD player.");
    }

    public void setVolume(int level) {
        System.out.println("Amplifier volume set to " + level + ".");
    }

    public void off() {
        System.out.println("Amplifier turned off.");
    }
}