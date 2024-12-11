package weekTen.interfaces;

public class customerInteractable implements Interactable{

    @Override

    public void interact() {
        System.out.println("Customer is reserving a table and placing an order.");
    }
}