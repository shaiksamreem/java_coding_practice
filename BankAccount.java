package samreen;

public class BankAccount {

	    public String accountHolderName; // public access
	    protected double balance;        // protected access
	    private String accountNumber;    // private access
	    String branchName;               // default access

	    public BankAccount(String accountHolderName, String accountNumber, double balance, String branchName) {
	        this.accountHolderName = accountHolderName;
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	        this.branchName = branchName;
	    }

	    public String getAccountNumber() {
	        return accountNumber; // public method to access private member
	    }

	    protected void deposit(double amount) {
	        balance += amount;
	    }

	    void displayBranchName() {
	        System.out.println("Branch: " + branchName);
	    }
	}


