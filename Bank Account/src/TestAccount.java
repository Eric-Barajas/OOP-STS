
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		initialize(make instance of the class)
		BankAccount bankCS = new BankAccount();
//		make test
		bankCS.deposit(300, "checking");
		bankCS.deposit(600, "savings");
//		
		bankCS.checkWithdraw(300);
		bankCS.saveWithdraw(300);
		
		bankCS.displayAllBalance();
	}

}
