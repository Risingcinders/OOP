package bankAccount;

public class BankTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Belly = new BankAccount();
		Belly.deposit(200,"Savings");
		Belly.deposit( 50, "Checking");
		Belly.checkBalance();
	}

}
