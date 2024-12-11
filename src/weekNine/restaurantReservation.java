package weekNine;

import java.util.Random;

public class restaurantReservation {
    public String customerName;
    public String reservationTime;
    public int numberOfGuests;
    private String foodOrder;
    private String vipId;
    private String reservationNumber;

    private static final Random random = new Random();

    // Constructor for VIP guests
    public restaurantReservation(String vipId) {
        this.vipId = vipId;
        this.reservationNumber = generateReservationNumber();
    }

    // Constructor for regular guests
    public restaurantReservation(String customerName, String reservationTime, int numberOfGuests) {
        this.customerName = customerName;
        this.reservationTime = reservationTime;
        this.numberOfGuests = numberOfGuests;
        this.reservationNumber = generateReservationNumber();
    }

    // Method to generate a unique reservation number
    private String generateReservationNumber() {
        return "RES" + (1000 + random.nextInt(9000)); // Generates a number between 1000 and 9999
    }

    // Method to display reservation details
    public void displayReservationDetails() {
        System.out.println("Thank You for Your Reservation at Gourmet Restaurant!");
        System.out.println("-------------------------------------------");

        if (vipId != null) {
            System.out.println("VIP ID: " + vipId);
            System.out.println("Food Order: " + foodOrder);
        } else {
            System.out.println("Reservation Name: " + customerName);
            System.out.println("Reservation Time: " + reservationTime);
            System.out.println("Number of Guests: " + numberOfGuests);
            System.out.println("Food Order: " + foodOrder);
        }

        System.out.println("Reservation Number: " + reservationNumber);
        System.out.println("-------------------------------------------");
    }

    // Set food order
    public void setFoodOrder(String foodOrder) {
        this.foodOrder = foodOrder;
    }

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setReservationTime(String reservationTime) {
        this.reservationTime = reservationTime;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public void setfoodOrder(String foodOrder) {
        this.foodOrder = foodOrder;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public String getReservationTime() {
        return reservationTime;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public String getVipId() {
        return vipId;
    }

    public String getFoodOrder() {
        return foodOrder;
    }
}
