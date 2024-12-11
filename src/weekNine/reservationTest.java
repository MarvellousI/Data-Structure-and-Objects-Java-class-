package weekNine;

public class reservationTest {
    public static void main(String[] args) {
        // Creating instances
        restaurantReservation regularReservation1 = new restaurantReservation( "James Oliver", "7:30 PM", 4);
        restaurantReservation regularReservation2 = new restaurantReservation("Kamai Imo", "8:00 PM", 2 );
        restaurantReservation vipReservation = new restaurantReservation("VIP123");

        // Set food orders for reservations
        regularReservation1.setFoodOrder("Steak and Wine");
        regularReservation2.setFoodOrder("Salmon and Champagne");

        // Display reservation details
        System.out.println("VIP Reservation Details:");
        vipReservation.setFoodOrder("Salmon and Champagne");
        vipReservation.displayReservationDetails();
        System.out.println();

        System.out.println("Regular Reservation 1 Details:");
        regularReservation1.displayReservationDetails();
        System.out.println();

        System.out.println("Regular Reservation 2 Details:");
        regularReservation2.displayReservationDetails();
    }
}
