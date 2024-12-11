package AirlineHashMap;

public class Main {
    public static void main(String[] args) {
        // Create an instance of FlightReservation
        FlightReservation flightReservation = new FlightReservation();

        flightReservation.addReservation("SR9341", "Chibuike, DET387, 1A");
        flightReservation.addReservation("SR8542", "Sinclair, AM543, 15B");
        flightReservation.addReservation("SR67890", "Kam, ST732, 20C");


        flightReservation.displayAllReservations();

        flightReservation.removeReservation("SR67890");

        System.out.println("\nReservations after removal:");
        flightReservation.displayAllReservations();
    }
}
