package com.demo.Day22;

public interface Payment {
	public void pay(double amount);

	public default void genrateReceipt(double amount) {
		System.out.println("Receipt genrated Successfully for the amount : " + amount);

	}

	public static boolean validateAmount(double amount) {
		return amount > 0;
	}

}
