import java.util.*;
import java.lang.Math;
public class BankAccount {
//	attributes below
	private String accountNumber;
	private static double checkingBalance;
	private static double savingBalance;
	private static int numberOfAccount = 0;
	private static double totalAmount = 0;
	
//	constructors below
	public BankAccount() {
		this.accountNumber = generateRandomAccountNumber();
	}
	public String getAccountNumber() {
		System.out.println("The Account Number is: "+accountNumber);
		return accountNumber;
	}
	private static String generateRandomAccountNumber() {
		Random r = new Random();
		int num = Math.abs(r.nextInt(2000000000) + 1000000000);
		numberOfAccount++;
		System.out.println("Number of Account: "+numberOfAccount);
		System.out.println("New Account Created: "+num);
		String newAccount = String.valueOf(num);
		return newAccount;
	}
//	getter below
	public void seeCheckingBalance() {
		System.out.println("Your Checking Balance: $"+checkingBalance);
	}
	public void seeSavingBalance() {
		System.out.println("Your Saving Balance: $"+savingBalance);
	}
	public void seeTotalAmount() {
		System.out.println("Your total Amount is: $"+totalAmount);
	}
//	setter below
	public static void deposit(double amount, String location) {
		if(location == "checking" || location == "Checking") {
			System.out.println("You just made $"+amount+" deposit to your: "+location);
			checkingBalance += amount;
			totalAmount += amount;
		}
		if(location == "saving" || location == "Saving") {
			System.out.println("You just made $"+amount+" deposit to your: "+location);
			savingBalance += amount;
			totalAmount += amount;
		}
	}
	public static void withdraw(double amount, String location) {
		if(location == "checking" || location == "Checking") {
			System.out.println("You just made $"+amount+" withdraw from your: "+location);
			checkingBalance -= amount;
			totalAmount -= amount;
		}
		if(location == "saving" || location == "Saving") {
			System.out.println("You just made $"+amount+" withdraw from your: "+location);
			savingBalance -= amount;
			totalAmount -= amount;
		}
	}
}
