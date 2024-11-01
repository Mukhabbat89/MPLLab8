import java.util.InputMismatchException;
import java.util.Scanner;

// Main application class that allows the user to create and display different types of poems.
public class PoemApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Poem poem = null;
        int choice = 0;

        // Prompt user for poem type until a valid choice is entered
        do {
            System.out.println("Choose the type of Poem:");
            System.out.println("1. General Poem");
            System.out.println("2. Couplet");
            System.out.println("3. Limerick");
            System.out.println("4. Haiku");
            try {
                choice = scanner.nextInt();
                if (choice < 1 || choice > 4) {
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        } while (choice < 1 || choice > 4);

        scanner.nextLine();  // Clear buffer
        System.out.print("Enter the title of the Poem: ");
        String title = scanner.nextLine();

        // Instantiate the appropriate poem type based on user choice
        switch (choice) {
            case 1 -> {
                System.out.print("Enter the number of lines: ");
                int lines;
                try {
                    lines = scanner.nextInt();
                    poem = new Poem(title, lines);
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Number of lines must be an integer.");
                }
            }
            case 2 -> poem = new Couplet(title);
            case 3 -> poem = new Limerick(title);
            case 4 -> poem = new Haiku(title);
        }

        // Display poem details if a poem was successfully created
        if (poem != null) {
            poem.display();
        }

        scanner.close();
    }
}
