package project3;

import java.util.ArrayList;

public class Customer {
    //instance variables
    private String firstName;
    private String lastName;
    private String pin;
    private ArrayList<Account> accounts;

    //create customer information (constructor)
    public Customer(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        accounts = new ArrayList<>();
    }
    //adding an account
    public void addAccount (Account account){
        accounts.add(account);
    }
    //removing an account from the list
    public void removeAccount(Account account) {
        accounts.remove(account);
    }
    //get a single Account by account number
    public Account getAccountByNum (int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
    //get all the Accounts’ info (returns a String)
    public String getAllAccountInfo () {
        String info = "";
        for (Account account : accounts) {
            info += account.toString() + "\n";
        }
        return info;
    }
    @Override
    public String toString() {
        return ("Customer Name:  " + firstName + "" + lastName + "\n PIN:" + pin);
    }
    //firstname (getter)
    public String getFirstName() {
        return firstName;
    }
    //lastname (getter)
    public String getLastName() {
        return lastName;
    }
    //pin (getter)
    public String getPin() {
        return pin;
    }
}
