package linkedListActivity;

public class Main {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("Marvellous Imo", "659125756", 1500);
        BankAccount account2 = new BankAccount("Ella Shay", "165789012", 2500);

        // Add transactions to account1
        account1.addTransaction("Deposit $500");
        account1.addTransaction("Withdraw $200");
        account1.addTransaction("Deposit $300\n");

        // Add transactions to account2
        account2.addTransaction("Deposit $1000");
        account2.addTransaction("Withdraw $400");
        account2.addTransaction("Deposit $600");

        // Print account information
        System.out.println(account1.getAccountInfo());
        account1.displayTransactions();

        System.out.println(account2.getAccountInfo());
        account2.displayTransactions();

        // Remove one transaction from each account
        account1.removeTransaction();
        account2.removeTransaction();

        // Display updated transactions
        System.out.println("\nUpdated Transactions:");
        account1.displayTransactions();
        account2.displayTransactions();

    }
}
