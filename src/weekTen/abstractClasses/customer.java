package weekTen.abstractClasses;

public class customer extends user {
    private String reservationDetails;

    public customer(){
    }

    public customer(String name, int contactNumber, String email, String password, String reservationDetails) {
        super(name, contactNumber, email, password);
        this.reservationDetails = reservationDetails;
    }


    @Override
    public void displayDetails() {
        System.out.println(String.format("Customer Name: " + name + ", Contact: " + contactNumber + ", Reservation: " + reservationDetails));
    }
}
