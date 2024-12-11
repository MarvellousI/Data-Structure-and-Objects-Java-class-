package AirlineHashMap;
import java.util.HashMap;
public class FlightReservation {
    private String passengerName;
    private String flightNumber;
    private String seatNumber;
    HashMap<String, String> reservationDetails = new HashMap<>();

    public FlightReservation() {
        reservationDetails = new HashMap<>();
    }

    // Method to add a reservation to the HashMap
    public void addReservation(String reservationDet, String details) {
        reservationDetails.put(reservationDet, details);
    }

    // Method to remove a reservation from the HashMap
    public void removeReservation(String reservationDet) {
        if (reservationDetails.containsKey(reservationDet)) {
            reservationDetails.remove(reservationDet);
            System.out.println("Reservation " + reservationDet + " removed successfully.");
        } else {
            System.out.println("Reservation Details " + reservationDet + " not found.");
        }
    }

    // Method to retrieve reservation details by reservation ID
    public String getReservation(String reservationId) {
        return reservationDetails.getOrDefault(reservationId, "Reservation not found.");
    }

    // Method to display all reservations
    public void displayAllReservations() {
        if (reservationDetails.isEmpty()) {
            System.out.println("No reservations to display.");
        } else {
            System.out.println("All Reservations:");
            for (String reservationId : reservationDetails.keySet()) {
                System.out.println("Reservation Details: " + reservationId + " Confirmation: " + reservationDetails.get(reservationId));
            }
        }
    }
}

