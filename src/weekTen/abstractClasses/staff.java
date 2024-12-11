package weekTen.abstractClasses;

public class staff extends user{
    private String role;

    public staff(String name, int contactNumber, String email, String password, String role) {
        super(name, contactNumber, email, password);
        this.role = role;
    }

        @Override
        public void displayDetails() {
        System.out.println(String.format("Staff Name: " + name + ", Contact: " + contactNumber + ", Role: " + role));
        }
}
