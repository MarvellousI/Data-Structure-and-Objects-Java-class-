package linkedListActivity;
import java.util.LinkedList;

public class BankAccount {
    //Instance variable
    private String accountHolderName, accountNumber;
    private double  balance;

    private LinkedList<String> transactionList = new LinkedList<>();

    public BankAccount(){
    }
    public BankAccount(String accountHolderName, String accountNumber, int balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionList = new LinkedList<>();
    }

    public void addTransaction(String transaction){
        transactionList.add(transaction);
    }
    public void addTransaction(int index, String transaction){
        transactionList.add(index, transaction);
    }
    public void removeTransaction(){
        if (transactionList.isEmpty()){
            transactionList.removeFirst();
        }
    }
    public String getAccountInfo(){
        return ("Account Holder: " + accountHolderName + "," + " Account Number:" + accountNumber + "," + " Balance: $" + balance);
    }
    public void displayTransactions(){
        System.out.println("Transactions for " + accountHolderName +":");
        for (String transaction : transactionList){
            System.out.println(transaction);
        }

    }

}
