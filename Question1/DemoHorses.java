// DemoHorses.java
import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoHorses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input validation for Horse details
        System.out.println("Enter Horse details:");
        System.out.print("Name: ");
        String horseName = input.nextLine(); // Name does not need specific validation

        System.out.print("Color: ");
        String horseColor = input.nextLine(); // Color does not need specific validation

        int horseBirthYear = 0;
        boolean validYear = false;
        while (!validYear) {
            System.out.print("Birth Year: ");
            try {
                horseBirthYear = input.nextInt(); // Check for integer input
                validYear = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer for the birth year.");
                input.next(); // Clear invalid input
            }
        }
        Horse horse = new Horse(horseName, horseColor, horseBirthYear);

        // Input validation for RaceHorse details
        System.out.println("\nEnter RaceHorse details:");
        System.out.print("Name: ");
        input.nextLine(); // Consume leftover newline
        String raceHorseName = input.nextLine();

        System.out.print("Color: ");
        String raceHorseColor = input.nextLine();

        int raceHorseBirthYear = 0;
        validYear = false;
        while (!validYear) {
            System.out.print("Birth Year: ");
            try {
                raceHorseBirthYear = input.nextInt();
                validYear = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer for the birth year.");
                input.next();
            }
        }

        int numberOfRaces = 0;
        boolean validRaces = false;
        while (!validRaces) {
            System.out.print("Number of Races: ");
            try {
                numberOfRaces = input.nextInt(); // Check for integer input
                validRaces = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer for the number of races.");
                input.next();
            }
        }
        RaceHorse raceHorse = new RaceHorse(raceHorseName, raceHorseColor, raceHorseBirthYear, numberOfRaces);

        // Display Horse details
        System.out.println("\nHorse Details:");
        System.out.println("Name: " + horse.getName());
        System.out.println("Color: " + horse.getColor());
        System.out.println("Birth Year: " + horse.getBirthYear());

        // Display RaceHorse details
        System.out.println("\nRaceHorse Details:");
        System.out.println("Name: " + raceHorse.getName());
        System.out.println("Color: " + raceHorse.getColor());
        System.out.println("Birth Year: " + raceHorse.getBirthYear());
        System.out.println("Number of Races: " + raceHorse.getNumberOfRaces());

        input.close();
    }
}
