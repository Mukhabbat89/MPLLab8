// Base class representing a general Poem with title and number of lines.
public class Poem {
    private String title;
    private int lines;

    // Constructor with input validation for number of lines
    public Poem(String title, int lines) {
        this.title = title;
        if (lines <= 0) {  // Ensures a valid line count
            throw new IllegalArgumentException("Line count must be positive.");
        }
        this.lines = lines;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for lines
    public int getLines() {
        return lines;
    }

    // Displays poem details
    public void display() {
        System.out.println("Poem: " + title + ", Lines: " + lines);
    }
}
