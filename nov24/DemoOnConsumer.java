package com.demo.nov24;

import java.util.Arrays;
import java.util.function.Consumer;

public class DemoOnConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<Integer> con = (num1) -> {

			System.out.println(num1 * num1);
		};
		con.accept(5);

		Consumer<Integer[]> sortary = (arr) -> {
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		};
		Integer arr[] = { 13, 23, 4, 5, 223, 52, 15, 5689, 34, 1010, 232, 32, 335, 3, 34444 };
		sortary.accept(arr);

		Consumer<Employee[]> printemp = (employees) -> {
			for (Employee e : employees)
				System.out.println(e.getName());
		};

		Employee[] employees = { new Employee("Alice", 50000), new Employee("Bob", 70000),
				new Employee("Charlie", 60000), new Employee("David", 55000), new Employee("Eva", 80000),
				new Employee("Grace", 72000), new Employee("Helen", 58000), new Employee("Frank", 65000) };
		printemp.accept(employees);

	}

}
