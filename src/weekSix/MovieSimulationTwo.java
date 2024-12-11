package weekSix;

import java.util.Random;

public class MovieSimulationTwo {

    private static final int Rows = 5;
    private static final int Columns = 10;

    public static void main(String[] args) {

        // Declare detail using String[] format
        String[] movieNames = {"Movie 1: Jumanji", "Movie 2: Matrix", "Movie 3: Star Wars", "Movie 4: Oppenheimer"};
        String[] movieTypes = {"2D", "3D", "2D", "Drama/Historical"};
        double[] moviePrices = {15.25, 20.15, 18.11, 22.12};

        // Display movie details
        displayMovieDetails(movieNames, movieTypes, moviePrices);

        // assign seat availability
        int[][] movieAvailability = new int[Rows][Columns];
        setSeatAvailability(movieAvailability);

        // Display seat availability
        System.out.println("\n----------INITIAL SEATS------------");
        displaySeatAvailability(movieAvailability);

        // Assign Random seat availability
        randomAvailability(movieAvailability);

        // Display seat availability
        System.out.println("\n----------RANDOM GENERATED SEATS----------");
        displaySeatAvailability(movieAvailability);
    }

    // Assign movie details
    public static void displayMovieDetails(String[] movieNames, String[] movieTypes, double[] moviePrices) {
        System.out.printf("%-20s %-15s %-10s%n", "Movie Name", "Type", "Price");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("%-20s %-15s $%-10.2f%n", movieNames[i], movieTypes[i], moviePrices[i]);
        }
    }

    // Method to set seat availability to all available (0)
    public static void setSeatAvailability(int[][] availability) {
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                availability[i][j] = 0; // 0 = available
            }
        }
    }

    // Method to display random seat availability
    public static void randomAvailability(int[][] availability) {
        Random random = new Random();
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                availability[i][j] = random.nextInt(2); // Randomly set to 0 (available) or 1 (occupied)
            }
        }
    }

    // Method to display seat availability
    public static void displaySeatAvailability(int[][] availability) {
        System.out.println("Seating Availability: [1 = unavailable ; O = available]");
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                System.out.printf(" %s ", availability[i][j] == 0 ? "0" : "1");
            }
            System.out.println();
        }
    }
}
