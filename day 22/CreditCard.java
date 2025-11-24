package com.demo.Day22;



public class CreditCard implements Payment {
	@Override
	public void pay(double amount) {
		if (Payment.validateAmount(amount)) {
			System.out.println("Amount paid "+amount+"using credit card");
			genrateReceipt(amount);
		}
		else {
			System.out.println("Payment declined or failed...");
		}
	}

}
