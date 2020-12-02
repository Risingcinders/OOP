package bankAccount;

import java.util.Random;

public class BankAccount {
	private String accountnum;
	
	public double getCheckingbal() {
		return checkingbal;
	}

	public double getSavingsbal() {
		return savingsbal;
	}

	private double checkingbal;
	private double savingsbal;
	private static double numofaccounts = 0;
	private static double totalmoney = 0;
	
	private double genAcctNum() {
		double bean = Math.floor(Math.random() * (1000000000)*10);
		System.out.println(bean);
		return bean;		
	}
	
	BankAccount() {
		accountnum = String.valueOf(genAcctNum());
		checkingbal = 0;
		savingsbal = 0;
		numofaccounts++;
	}
	
	public void withdraw(int amt, String acct) {
		if (acct == "Savings") {
			if (amt >= savingsbal) {
				savingsbal -= amt;
				totalmoney -= amt;
			} else {
				System.out.println("Insufficient funds.");
			}
			
		} else if (acct == "Checking") {
			if (amt >= checkingbal) {
				checkingbal -= amt;
				totalmoney -= amt;
			} else {
				System.out.println("Insufficient funds.");
			}			
		} else {
			System.out.println("Invalid account name, enter either Savings or Checking");
		}
	}
	
	public void deposit(int amt, String acct) {
		if (acct == "Savings") {
			if (amt >= savingsbal) {
				savingsbal += amt;
				totalmoney += amt;
			} else {
				System.out.println("Insufficient funds.");
			}
			
		} else if (acct == "Checking") {
			if (amt >= checkingbal) {
				checkingbal += amt;
				totalmoney += amt;
			} else {
				System.out.println("Insufficient funds.");
			}			
		} else {
			System.out.println("Invalid account name, enter either Savings or Checking");
		}
	}
	
	public void checkBalance() {
		System.out.println(String.format("Your Checking balance is $%.2f and your savings balance is $%.2f", checkingbal, savingsbal));
	}
	
	
	
	
	
}
