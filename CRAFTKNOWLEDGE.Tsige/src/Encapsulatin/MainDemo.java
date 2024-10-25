package Encapsulatin;

public class MainDemo {
	class BankAccount {
	    // Private fields (cannot be accessed directly outside the class)
	    private String accountHolderName;
	    private double balance;

	    // Constructor to initialize account holder's name and balance
	    public BankAccount(String accountHolderName, double initialBalance) {
	        this.accountHolderName = accountHolderName;
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            this.balance = 0;
	            System.out.println("Initial balance cannot be negative.");
	        }
	    }

	    // Getter method for account holder's name
	    public String getAccountHolderName() {
	        return accountHolderName;
	    }

	    // Setter method for account holder's name
	    public void setAccountHolderName(String accountHolderName) {
	        this.accountHolderName = accountHolderName;
	    }

	    // Getter method for balance
	    public double getBalance() {
	        return balance;
	    }

	    // Method to deposit money into the account
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println(amount + " deposited. New balance: " + balance);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    // Method to withdraw money from the account
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println(amount + " withdrawn. New balance: " + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient balance.");
	        }
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Creating a BankAccount object
	        BankAccount account = new BankAccount("John Doe", 500.0);

	        // Displaying initial account details
	        System.out.println("Account Holder: " + account.getAccountHolderName());
	        System.out.println("Initial Balance: $" + account.getBalance());

	        // Depositing money
	        account.deposit(200);

	        // Withdrawing money
	        account.withdraw(100);

	        // Attempting to withdraw more than the balance
	        account.withdraw(700);  // Will show an error message

	        // Changing account holder's name
	        account.setAccountHolderName("Jane Doe");
	        System.out.println("Updated Account Holder: " + account.getAccountHolderName());
	    }
	}

	
	}


