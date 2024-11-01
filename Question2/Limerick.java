// Subclass for a Limerick, which always has 5 lines.
public class Limerick extends Poem {
    private static final int LINES = 5;

    // Constructor for Limerick, which sets lines to 5
    public Limerick(String title) {
        super(title, LINES);
    }
}
