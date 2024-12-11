package weekFive.challengeQuestions;
import java.util.Scanner;

public class CustomerFeedbackManager {
    public static void main(String[] args) {
        final int NUM_CUSTOMERS = 5; // Number of customers
        final int NUM_ITEMS = 5; // Number of items


        Scanner scanner = new Scanner(System.in);

        // Create arrays to hold customer names, item names, and ratings
        String[] customerNames = new String[NUM_CUSTOMERS];
        String[] itemNames = new String[NUM_ITEMS];
        int[] ratings = new int[NUM_CUSTOMERS * NUM_ITEMS]; // Store ratings for all customer-item pairs

            // Input customer names

        System.out.println("Enter names of " + NUM_CUSTOMERS + " customers:");
        for (int i = 0; i < NUM_CUSTOMERS; i++) {
            System.out.print("Customer " + (i + 1) + ": ");
            customerNames[i] = scanner.nextLine();
            }


        // Input item names
        System.out.println("\nEnter names of " + NUM_ITEMS + " items:");
        for (int i = 0; i < NUM_ITEMS; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            itemNames[i] = scanner.nextLine();
            }

            // Input ratings

        for (int i = 0; i < NUM_CUSTOMERS; i++) {
            for (int j = 0; j < NUM_ITEMS; j++) {
                int index = i * NUM_ITEMS + j; // Calculate index for ratings array
                System.out.print("Enter rating for " + customerNames[i] + " on item " + itemNames[j] + " (1-5): ");
                ratings[index] = scanner.nextInt();

                    // Ensure rating is within the valid range
                while (ratings[index] < 1 || ratings[index] > 5) {
                    System.out.print("Invalid rating. Please enter a rating between 1 and 5: ");
                    ratings[index] = scanner.nextInt();
                    }
                }
            }

            // Print feedback table
        System.out.println("\nCustomer Name\tItem Name\tRating");
        System.out.println("-------------------------------------");
        for (int i = 0; i < NUM_CUSTOMERS; i++) {
            for (int j = 0; j < NUM_ITEMS; j++) {
                int index = i * NUM_ITEMS + j;
                System.out.printf("%-15s %-15s %d\n", customerNames[i], itemNames[j], ratings[index]);
                }
            }

            // Calculate and print average ratings for each item
        System.out.println("\nAverage ratings for each item:");
        for (int j = 0; j < NUM_ITEMS; j++) {
            int totalRating = 0;
            for (int i = 0; i < NUM_CUSTOMERS; i++) {
                int index = i * NUM_ITEMS + j;
                totalRating += ratings[index];
                }
            double averageRating = (double) totalRating / NUM_CUSTOMERS;
            System.out.printf("%-15s %.2f\n", itemNames[j], averageRating);
            }

        }

}
