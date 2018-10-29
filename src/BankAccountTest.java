
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bA1 = new BankAccount();
		BankAccount bA2 = new BankAccount();
		BankAccount bA3 = new BankAccount();

//		bA1.getAccountNumber();
//		bA2.getAccountNumber();
//		bA3.getAccountNumber();
		bA1.deposit(100, "checking");
		bA1.deposit(500, "saving");
		bA1.seeCheckingBalance();
		bA1.seeSavingBalance();
		bA1.seeTotalAmount();
		bA1.withdraw(50, "saving");
		bA1.seeSavingBalance();
		bA1.seeTotalAmount();


	}

}
