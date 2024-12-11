package project3;

import java.util.ArrayList;

public class Bank {
    //list customers
    private ArrayList<Customer> customers;

    //constructor
    public Bank(){
        customers = new ArrayList<>();
    }

    //(method) adding a customer to the list
    public void addCustomer(Customer customer){
        customers.add(customer);
        System.out.println("New customer: " + customer.getFirstName() + " " + customer.getLastName());
    }
    //(method) removing a customer to the list
    public void removeCustomer(String pin) {
        for (Customer customer : customers ){
            if (customer.getPin().equals(pin)){
                customers.remove(customer);
                System.out.println("The customer with this PIN" + pin + "is removed succesfully");
                return;
            }
        }
        System.out.println("The Customer with this pin" + pin + "is not found");
    }
    //(method) get a particular Customer by PIN
    public Customer getCustomerByPin(String pin){
        for (Customer customer : customers){
            if (customer.getPin().equals(pin)) {
                return customer;
            }
        } return null;
    }

    //(method) get all Customer info
    public String getAllCustomerInfo() {
        if (customers.isEmpty()) {
            return ("No customer info right now");
        }
        String customerInfo = "";
        for (Customer customer : customers) {
            customerInfo += customer.toString() + "\n";
            customerInfo += ("Accounts:" + customer.getAllAccountInfo() + "\n");
        }
        return customerInfo;
    }
}
