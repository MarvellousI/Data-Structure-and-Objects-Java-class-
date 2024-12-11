package weekSeven;

import java.util.Random;
import java.util.Scanner;

public class MovieSimulationThree {
    final static int NUM_OF_MOVIES = 4;
    final static int ROWS = 5; // A to E
    final static int COLUMNS = 10; // 1 to 10

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Movie details
        String[] movieNames = {"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
        String[] movieTypes = {"2D", "3D", "2D", "Drama/Historical"};
        double[] moviePrices = {15.25, 20.15, 18.11, 22.12};

        // Initialize seat availability
        int[][] movieAvailability = new int[ROWS][COLUMNS];

        // Call methods
        displayMovieDetails(movieNames, movieTypes, moviePrices);
        int index = selectMovie(movieNames);
        displaySelectedMovie(movieNames, movieTypes, moviePrices, index);

        randomizeAvailability(movieAvailability);
        System.out.println("\n----------- SEATS AVAILABLE ----------------");
        displaySeatAvailability(movieAvailability);
    }

    // Display movie details
    public static void displayMovieDetails(String[] mNames, String[] mTypes, double[] mPrices) {
        System.out.printf("\n------------------------- Movie Details -----------------------\n");
        System.out.printf("%-20s %-20s %-20s%n", "Movie Name", "Movie Type", "Movie Price");
        for (int i = 0; i < mNames.length; i++) {
            System.out.printf("Movie %d: %-16s %-20s $%-19.2f%n", i + 1, mNames[i], mTypes[i], mPrices[i]);
        }
    }

    // Method to select a movie
    public static int selectMovie(String[] movieNames) {
        Scanner scanner = new Scanner(System.in);
        String selectedMovie;
        int index;

        while (true) {
            System.out.print("Enter the movie you would like to select: ");
            selectedMovie = scanner.nextLine().trim();

            for (index = 0; index < movieNames.length; index++) {
                if (movieNames[index].equalsIgnoreCase(selectedMovie)) {
                    return index; // Return the index if the movie is found
                }
            }
            System.out.println("Movie not found. Try again.");
        }
    }

    // Display the selected movie's details
    public static void displaySelectedMovie(String[] movieNames, String[] movieTypes, double[] moviePrices, int index) {
        System.out.printf("----------Movie Selection------------\nMovie Selected:  %s%nType: %s%nPrice: $%.2f%n", movieNames[index], movieTypes[index], moviePrices[index]);
    }

    // Randomize seat availability
    public static void randomizeAvailability(int[][] availability) {
        Random random = new Random();
        for (int i = 0; i < availability.length; i++) {
            for (int j = 0; j < availability[i].length; j++) {
                availability[i][j] = random.nextInt(2); // Randomly set to 0 (available) or 1 (occupied)
            }
        }
    }

    // Display seat availability in a theater seating arrangement
    public static void displaySeatAvailability(int[][] availability) {
        System.out.print("    "); // Print initial space for seat numbers
        for (int j = 0; j < COLUMNS; j++) {
            System.out.printf("%2d ", j + 1); // Seat numbers from 1 to 10
        }
        System.out.println();

        for (int i = 0; i < ROWS; i++) {
            System.out.print((char) ('A' + i) + " | "); // Row labels from A to E
            for (int j = 0; j < COLUMNS; j++) {
                System.out.printf("%2s ", availability[i][j] == 0 ? "0" : "1"); // 0 for available, 1 for occupied
            }
            System.out.println();
        }
    }
}
