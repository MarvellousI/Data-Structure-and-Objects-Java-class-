package project3;

import java.util.Scanner;

public class Menu {
    private Scanner scn;
    private Bank bank;

    //construcor
    public Menu() {
        scn = new Scanner(System.in);
        bank = new Bank();
    }
    public void runMenu() {
        int choice = 0;
        while (choice != 4) {
            displayMainMenu();
            choice = scn.nextInt();
            scn.nextLine(); // Clear buffer
            if (choice == 1) {
                accessAccount();
            } else if (choice == 2) {
                openNewAccount();
            } else if (choice == 3) {
                closeAllAccounts();
            } else if (choice == 4) {
                System.out.println("Thanks for using Kamai Banking App \n Goodbye. Exiting..........");
            } else {
                System.out.println("Invalid Entry. Please enter a valid number.");
            }
        }
    }

    //display main menu
    private void displayMainMenu() {
            System.out.println("\n******* Menu *******");
        System.out.print("Please make a selection: \n");
            System.out.println("1. Access Account");
            System.out.println("2. Open a New Account");
            System.out.println("3. Close All Accounts");
            System.out.println("4. Exit");
    }
    private void accessAccount() {
        System.out.print("Enter your PIN: ");
        String pin = scn.nextLine();

        Customer customer = bank.getCustomerByPin(pin);
        if (customer == null) {
            System.out.println("PIN is not valid.");
            return;
        }
        System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Accounts:");
        System.out.println(customer.getAllAccountInfo());
        System.out.print("Please enter account number of the account you would like to access: ");
        int accountNumber = scn.nextInt();
        scn.nextLine();

        Account account = customer.getAccountByNum(accountNumber);
        if (account == null) {
            System.out.println("Account number invalid.");
            return;
        }
        accessAccountMenu(account);
    }
    //Account menu
    private void accessAccountMenu(Account account) {
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- Account Menu ---");
            System.out.print("Please make a selection: \n");
            System.out.println("1. Make a deposit");
            System.out.println("2. Make a withdrawl");
            System.out.println("3. See account balance");
            System.out.println("4. Close account");
            System.out.println("5. Exit");
            choice = scn.nextInt();

            if (choice == 1) {
                System.out.print("Enter the deposit amount: ");
                double depositAmount = scn.nextDouble();
                account.deposit(depositAmount);
            } else if (choice == 2) {
                System.out.print("Enter the amount of withdrawal: ");
                double withdrawalAmount = scn.nextDouble();
                account.withDraw(withdrawalAmount);
            } else if (choice == 3) {
                System.out.printf("Account balance is: $ %.2f\n", account.getBalance());
            } else if (choice == 4) {
                System.out.println("Close account");
            } else if (choice == 5) {
                System.out.println("Exit");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    //open a new account
    private void openNewAccount() {
        System.out.print("Are you a new customer?\n 1) Yes \n 2) No \n");
        String response = scn.nextLine();
        Customer customer = null;
        if (response.equalsIgnoreCase("1")) {
            customer = createNewCustomer();
        } else if (response.equalsIgnoreCase("2")) {
            System.out.print("Please enter your PIN: ");
            String pin = scn.nextLine();
            customer = bank.getCustomerByPin(pin);

            if (customer == null) {
                System.out.println("PIN is invalid.");
                return;
            }
        } else {
            System.out.println("Invalid response. Returning to Main Menu.");
            return;
        }

        System.out.print("Please enter deposit account: ");
        double initialDeposit = scn.nextDouble();
        scn.nextLine(); // Clear the buffer

        Account newAccount = new Account(initialDeposit);
        customer.addAccount(newAccount);
        System.out.println("New Account Opened: " + newAccount.getAccountNumber());
    }
    // Create a new customer
    private Customer createNewCustomer() {
        System.out.print("Please enter your first name: ");
        String firstName = scn.nextLine();
        System.out.print("Please enter your last name: ");
        String lastName = scn.nextLine();
        System.out.print("Please enter a 4 digit PIN: ");
        String pin = scn.nextLine();

        Customer newCustomer = new Customer(firstName, lastName, pin);
        bank.addCustomer(newCustomer);
        return newCustomer;
    }

    // Close all accounts
    private void closeAllAccounts() {

    }
}
