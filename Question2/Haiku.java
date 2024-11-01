// Subclass for a Haiku, which always has 3 lines.
public class Haiku extends Poem {
    private static final int LINES = 3;

    // Constructor for Haiku, which sets lines to 3
    public Haiku(String title) {
        super(title, LINES);
    }
}
