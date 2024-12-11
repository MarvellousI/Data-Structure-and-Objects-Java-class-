package weekThirteen.setAndIteratorActivity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of RestSet to manage reservations
        RestSet restSet = new RestSet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Restaurant Reservation System");

        while (true) {
            // Display menu options
            System.out.println("\nSelect an option:");
            System.out.println("1: Add a reservation ID");
            System.out.println("2: View all reservation IDs");
            System.out.println("3: Exit the system");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    restSet.addReservation();
                    break;

                case 2:
                    restSet.displayReservation();
                    break;

                case 3:
                    // Exit
                    System.out.println("System exiting. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
    }
}

