package com.demo.Day22;

import java.util.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CreditCard cc = new CreditCard();
//		cc.pay(1222222);
//		
//		Upi upi =new Upi();
//		upi.genrateReceipt(100);
//		upi.genrateReceipt(10100);

//		Payment pay = (amount)->{
//				if (Payment.validateAmount(amount)) {
//					System.out.println("Amount paid "+amount+" using UPI");
//					
//				}
//				else {
//					System.out.println("Payment declined or failed...");
//				}};
//				
//				pay.pay(100);
//		PrintName printer = (String name) -> System.out.println("Name: " + name);
//		printer.printName("aadhil");
//
//		ReverseStringOfFunInterface r = (str) -> {
//			StringBuilder sb = new StringBuilder(str);
//			System.out.println(sb.reverse().toString());
//		};
//		
//		
//		
//		r.stringReverse("wasabi");
//		EvenOrOdd e = (int num) -> {
//			System.out.println(num%2 == 0 ? "even":"odd");
//		};
//		e.Eo(2);
//		String[] names = {"Banana", "Apple", "Mango", "Cherry"};
//		Sortt s = (String[] arr) -> {
//			Arrays.sort(arr);
//			for(String i:arr)
//				System.out.println(i);
//			
//		};
//	   s.sortStrings(names);
		String[] names = { "Banana", "Apple", "Mango", "Cherry" };
		Sortt s = (String[] arr) -> {
			for (String i : arr) {
				System.out.println(i.length());

			}
		};
		s.LenStrings(names);
	}
}
