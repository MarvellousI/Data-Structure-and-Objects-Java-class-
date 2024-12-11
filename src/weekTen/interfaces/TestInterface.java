package weekTen.interfaces;

public class TestInterface {
    public static void main(String[] args) {
        Interactable customer = new customerInteractable();
        Interactable staff = new staffInteractable();

        customer.interact();
        staff.interact();
    }
}
