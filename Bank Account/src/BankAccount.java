
public class BankAccount {
	// attributes or member variables
//	The class should have the following attributes: (double) checking balance, (double) savings balance.
    private double checkingbalance;
    private double savingsbalance;
    private String accountNumber;
    
    // class variable
// Create a class member (static) that has the number of accounts created thus far.
// Create a class member (static) that tracks the total amount of money stored in every account created.
    private static int totalBankAccounts = 0;
    private static double totalAllAccount = 0.00;
    
    // constructors
// In the constructor, be sure to increment the account count.
	public BankAccount() {
		this.checkingbalance = 0;
		this.savingsbalance = 0;
		totalBankAccounts ++;
		totalAllAccount += checkingbalance + savingsbalance;
	}
    
    public BankAccount(double checkingbalance, double savingsbalance) {
		this.checkingbalance = checkingbalance;
		this.savingsbalance = savingsbalance;
		totalBankAccounts ++;
		totalAllAccount += checkingbalance + savingsbalance;
	}

    // GETTERS / SETTERS / OTHER METHODS
// Create a getter method for the user's checking account balance.
// Create a getter method for the user's saving account balance.
	public double getCheckingbalance() {
		return checkingbalance;
	}

	public void setCheckingbalance(double checkingbalance) {
		this.checkingbalance = checkingbalance;
	}

	public double getSavingsbalance() {
		return savingsbalance;
	}

	public void setSavingsbalance(double savingsbalance) {
		this.savingsbalance = savingsbalance;
	} 

	//	METHOD
// Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
    public void deposit(double amount, String accountType) {
    	if (accountType == "checking") {
    		this.checkingbalance += amount;
    		totalAllAccount += amount;
    		System.out.println("You Have " + "$" + checkingbalance + " in your checkings account");
//    		System.out.println(checkingbalance);

    	}
    	if (accountType == "savings") {
    		this.savingsbalance += amount;
    		totalAllAccount += amount;
    		System.out.println("You Have " + "$" + savingsbalance + " in your savings account");
//    		System.out.println(savingsbalance);
    	}
    }
// Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    public String checkWithdraw(double amount) {
    	if (this.checkingbalance < amount) {
    		System.out.println("INSUFFICIENT FUNDS");
    		return "INSUFFICIENT FUNDS IN YOUR CHECKING";
    	}

    	else {
    		this.checkingbalance -= amount;
    		totalAllAccount -= amount;
			System.out.println(checkingbalance);
			return "WITHDRAW MADE";
    	}

    }
    public String saveWithdraw(double amount) {
    	if (this.savingsbalance < amount) {
    		System.out.println("INSUFFICIENT FUNDS");
    		return "INSUFFICIENT FUNDS IN YOUR SAVINGS";
    	}

    	else {
    		this.savingsbalance -= amount;
    		totalAllAccount -= amount;
			System.out.println("Succesful withdrawal, " + "$" + savingsbalance + " left in you savings account");
			return "WITHDRAW MADE";
    	}

    }
// Create a method to see the total money from the checking and saving.
    public double displayAllBalance() {
//    	why can't I use let keyword? Does this work?
    	double moneyInAccounts = this.checkingbalance + this.savingsbalance;
    	System.out.println(moneyInAccounts);
    	return moneyInAccounts;
    }
    
}
