package com.demo.nov24;

import java.util.function.Predicate;

public class DemoOnPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> isEven = num -> num % 2 == 0;
		Predicate<Integer> isPositive = num -> num > 0;

		System.out.println(isEven.test(100));

		System.out.println(isEven.test(233) ? "Even" : "Odd");

		Predicate<String> checklen = str -> str.length() > 8;
		System.out.println(checklen.test("djnncdjjkk"));

		Employee[] employees = { new Employee("Alice", 50000), new Employee("Bob", 70000),
				new Employee("Charlie", 60000), new Employee("David", 55000), new Employee("Eva", 80000),
				new Employee("Grace", 72000), new Employee("Helen", 58000), new Employee("Frank", 65000) };
		Predicate<Employee> checksal = (emp) -> emp.getSalary() >= 68000;

		for (Employee e : employees)
			System.out.println(checksal.test(e));
	}

}
