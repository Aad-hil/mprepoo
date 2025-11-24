package com.demo.nov24;

import java.util.*;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		Employee[] employees = { new Employee("Alice", 50000), new Employee("Bob", 70000),
				new Employee("Charlie", 60000), new Employee("David", 55000), new Employee("Eva", 80000),
				 new Employee("Grace", 72000), new Employee("Helen", 58000),new Employee("Frank", 65000) };

		
//		MyComparator com = (e1,e2)->Double.compare(e1.getSalary(), e2.getSalary());
//		Arrays.sort(employees, (e3, e4) -> com.salcompare(e3, e4));
	
		Arrays.sort(employees,(e1,e2)->e1.getName().compareTo(e2.getName()));

		for (Employee e : employees) {
			System.out.println(e.name + " - " + e.salary);
		}
	}
}
