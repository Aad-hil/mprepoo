package com.demo.nov24;

import java.util.function.Supplier;

public class DemoOnSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "one";
		Supplier<String> sup = ()->name.toUpperCase();
		System.out.println(sup.get());
		
		Supplier<Integer> ran = ()->(int)Math.round(Math.random()*10000);
		System.out.println(ran.get());
		
		
		int num1 = 30030,num2 =540;
		Supplier<Integer> maxx = ()->Math.max(num1, num2);
		System.out.println(maxx.get());
		


	}

}
