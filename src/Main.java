import facade.HomeTheaterFacade;
import subsystem.*;

public class Main {
    public static void main(String[] args) {
        // Instantiate subsystem components
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        // Instantiate Facade with subsystem components
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                amp, dvd, projector, screen, lights, popper
        );

        // Client uses the simple facade interface
        homeTheater.watchMovie("Interstellar");

        System.out.println("\n-----------------------------------\n");

        homeTheater.endMovie();
    }
}