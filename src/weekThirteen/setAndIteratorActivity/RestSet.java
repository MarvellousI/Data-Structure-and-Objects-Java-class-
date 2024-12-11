package weekThirteen.setAndIteratorActivity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class RestSet {
    private Set<String> reservation = new HashSet<>();

    public void addReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter reservation IDs to add or enter '0' to quit:");

        while (true) {
            //user input for reservation ID
            String reservationID = scanner.nextLine();

            // If the user enters '0', quit
            if (reservationID.equals("0")) {
                return;
            }
            reservation.add(reservationID);
        }
    }

    // Method 2: displayReservation
    public void displayReservation() {
        // Create an iterator for the reservation set
        Iterator<String> iterator = reservation.iterator();

        System.out.println("Restaurant Reservations:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

