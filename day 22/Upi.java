package com.demo.Day22;

public class Upi implements Payment{

	
	@Override
	public void pay(double amount) {
		if (Payment.validateAmount(amount)) {
			System.out.println("Amount paid "+amount+"using UPI");
			genrateReceipt(amount);
		}
		else {
			System.out.println("Payment declined or failed...");
		}
	}
	@Override
	public void genrateReceipt(double amount) {
		// TODO Auto-generated method stub
		Payment.super.genrateReceipt(amount);
		System.out.println("Thank ypu for using UPI...");
	}
	

}
