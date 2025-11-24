package com.demo.nov24;

import java.util.function.Function;

public class DemoOnFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> square = num -> num * num;
		int arr[] = { 13, 23, 4, 5, 223, 52, 15, 5689, 34, 1010, 232, 32, 335, 3, 34444 };
		for (int i = 0; i < arr.length; i++)
			System.out.println("Square of " + arr[i] + " = " + square.apply(arr[i]));

		Employee[] employees = { new Employee("Alice", 50000), new Employee("Bob", 70000),
				new Employee("Charlie", 60000), new Employee("David", 55000), new Employee("Eva", 80000),
				new Employee("Grace", 72000), new Employee("Helen", 58000), new Employee("Frank", 65000) };

		Function<Employee, String> Upper = (e) -> e.getName().toUpperCase();
		for (Employee e : employees)
			System.out.println(Upper.apply(e));

		Function<Integer, Integer> add20 = num -> num + 20;
		for (int i = 0; i < arr.length; i++)
			System.out.println(square.andThen(add20).apply(arr[i]));
		
		Function<Employee,Employee> checksal = (e) ->{
			if(e.getSalary()>50000) {
				return e;
			}
			return e;
		};

	}

}
