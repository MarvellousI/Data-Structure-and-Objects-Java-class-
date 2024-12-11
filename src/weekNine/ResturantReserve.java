package weekNine;

public class ResturantReserve {
    private String customerName;
    private String reservationTime;
    private int numberOfGuests;

    // Constructor to initialize attributes
    public ResturantReserve(String customerName, String reservationTime, int numberOfGuests) {
        this.customerName = customerName;
        this.reservationTime = reservationTime;
        this.numberOfGuests = numberOfGuests;
    }

    //method for overridden
    public String toString() {
        return "Customer: " + customerName +"," + " Time: " +  reservationTime + "," +
                " Guests:" + numberOfGuests + ",";
    }
}
// Subclass: RegularReservation
class RegularReservation extends ResturantReserve {

    public RegularReservation(String customerName, String reservationTime, int numberOfGuests) {
        super(customerName, reservationTime, numberOfGuests);
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + " (Seating type): Standard Seating.";
    }
}

// Subclass: VIPReservation
class VIPReservation extends ResturantReserve {
    private String vipID;

    public VIPReservation(String customerName, String reservationTime, int numberOfGuests, String vipID) {
        super(customerName, reservationTime, numberOfGuests);
        this.vipID = vipID;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + " (VIP ID): " + vipID;
    }
}

// Main class for demonstration
class RestaurantReservationSystem {
    public static void main(String[] args) {
        // Create instances of RegularReservation and VIPReservation
        ResturantReserve regularReservation = new RegularReservation("Alice", "7:00 PM", 4);
        ResturantReserve vipReservation = new VIPReservation("Bob", "8:00 PM", 2, "VIP123");

        // Demonstrate polymorphism
        ResturantReserve[] reservations = {regularReservation, vipReservation};

        // Print the reservation details using the overridden toString methods
        for (ResturantReserve reservation : reservations) {
            System.out.println(reservation.toString());
        }
    }
}
