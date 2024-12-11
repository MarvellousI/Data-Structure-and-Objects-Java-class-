package weekSix;
import java.util.Scanner;
public class MovieSimulationOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int MAX_MOVIES = 10; // Maximum number of movies

        // Declare arrays using String[] format
        String[] movieNames = new String[MAX_MOVIES];
        String[] movieTypes = new String[MAX_MOVIES];
        boolean[] movieAvailability = new boolean[MAX_MOVIES];
        double[] moviePrices = new double[MAX_MOVIES];

        // Input for the number of movies
        System.out.print("Enter the number of movies you want to enter (up to " + MAX_MOVIES + "): ");
        int numberOfMovies = scanner.nextInt();
        scanner.nextLine(); // Create newline

        // Reduce the number of movies if necessary
        if (numberOfMovies > MAX_MOVIES) {
            numberOfMovies = MAX_MOVIES;
            System.out.println("Limiting input to " + MAX_MOVIES + " movies.");
            }

        // Create a Loop to gather movie details
        for (int i = 0; i < numberOfMovies; i++) {
            System.out.print("Enter the name of movie " + (i + 1) + ": ");
            movieNames[i] = scanner.nextLine();

            System.out.print("Enter the type of movie: ");
            movieTypes[i] = scanner.nextLine();

            System.out.print("Is the movie available? (true/false): ");
            movieAvailability[i] = scanner.nextBoolean();
            scanner.nextLine(); // Create newline

            System.out.print("Enter the ticket price: ");
            moviePrices[i] = scanner.nextDouble();
            scanner.nextLine(); // Create newline
            }

        // Display output all movie details
        System.out.println("\n-----------------Movie Details-----------------");
        System.out.printf("%-20s %-15s %-10s $%-10s%n", "Movie Name", "Type", "Available", "Price");

        for (int i = 0; i < numberOfMovies; i++) {
            System.out.printf("%-20s %-15s %-10s $%-10.2f%n",
                    movieNames[i],
                    movieTypes[i],
                    movieAvailability[i] ? "Yes" : "No",
                    moviePrices[i]);

           }
    }
}