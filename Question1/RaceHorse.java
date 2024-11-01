// RaceHorse.java
public class RaceHorse extends Horse {
    // Additional field for the number of races the horse has competed in
    private int numberOfRaces;

    // Constructor for RaceHorse, includes attributes of Horse and numberOfRaces
    public RaceHorse(String name, String color, int birthYear, int numberOfRaces) {
        super(name, color, birthYear);
        this.numberOfRaces = numberOfRaces;
    }

    // Getter and setter for numberOfRaces
    public int getNumberOfRaces() {
        return numberOfRaces;
    }

    public void setNumberOfRaces(int numberOfRaces) {
        this.numberOfRaces = numberOfRaces;
    }
}
