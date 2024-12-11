package weekTen.abstractClasses;

public class TestAbstractClass {
    public static void main(String[] args) {
        user Alice = new customer("Alice", 123457890, "ali@gmail.com", "pass123", "Table for 2");
        Alice.displayDetails();

        user Bob = new staff("Bob", 987654321, "bob@gmail.com", "pass456", "Manager");
        Bob.displayDetails();
    }
}
