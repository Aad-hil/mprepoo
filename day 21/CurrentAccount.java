package com.demo.Maven;

public class CurrentAccount extends Account {
	private double overdraftLimit;

	public CurrentAccount(String accountName, long accountNumber, String bankname, String iFSC, double balance,
			double overdraftLimit) {
		super(accountName, accountNumber, bankname, iFSC, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= getBalance() + overdraftLimit) {
			setBalance(getBalance() - amount);
			System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + getBalance());
		} else {

			throw new InsufficientFundsException("Insufficient balance!");
		}

	}
}
