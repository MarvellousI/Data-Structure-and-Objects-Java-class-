package project3;

public class Account {
    private static int numbersOfAccounts = 1000;
    //Instance variables
    private double balance;
    private int accountNumber;


    //constructor
    public Account(double initialDeposit){
        accountNumber = numbersOfAccounts++;
        balance = initialDeposit;
    }
    //depositing in the account
    public void deposit(double amount){
        if (amount > 0){
            //add deposit to balance
            balance += amount;
            System.out.printf("Deposited: $%.2f\n", amount);
            System.out.printf("Updated balance $%.2f\n", balance);
        } else {
            System.out.println("Sorry! try this deposit again");
        }
    }
    //withdrawing from the account
    public void withDraw(double amount) {
        if (amount > balance) {
            System.out.println("You don't have sufficient funds");
        } else {
            balance -= amount;
            System.out.println("You withdraw:" + amount);
            System.out.println("Your new balance is: " + balance);
        }
    }
    @Override
    public String toString() {
        return ("Account Number:  " + accountNumber + "\nBalance: $ " + String.format("%.2f", balance) + "\n");
    }
    //balance (getter)
    public double getBalance() {
        return balance;
    }
    //account number (getter)
    public int getAccountNumber() {
        return accountNumber;
    }
}
