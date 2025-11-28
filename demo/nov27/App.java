package com.demo.nov27;

import java.util.*;
import java.util.stream.*;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// Designed to cover all stream methods
		Integer[] arr = { 2, 23, 12, 44, 21, 54, 5, 7, 344, 100, 95, 7, 68, 678, 468, -10, 0, 75686, 8674, 4, 23 };

		System.out.println("------Collect to List------");
		List<Integer> l = Arrays.stream(arr).collect(Collectors.toList());
		System.out.println(l);

		System.out.println("------forEach------");
		Arrays.stream(arr).forEach(System.out::println);

		System.out.println("------min with lambda------");
		Integer min = Arrays.stream(arr).min((a, b) -> a - b).get();
		System.out.println(min);

		System.out.println("------min with Integer::compare------");
		min = Arrays.stream(arr).min(Integer::compare).get();
		System.out.println(min);

		System.out.println("------count------");
		long count = Arrays.stream(arr).count();
		System.out.println(count);

		System.out.println("------reduce sum------");
		int sum = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
		System.out.println(sum);

		System.out.println("------reduce min------");
		System.out.println(Arrays.stream(arr).reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b));

		System.out.println("------reduce max------");
		System.out.println(Arrays.stream(arr).reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b));

		System.out.println("------filter even numbers------");
		Stream.of(arr).filter(num -> num % 2 == 0).forEach(System.out::println);

		System.out.println("------map add 10------");
		Stream.of(arr).map(num -> num + 10).forEach(System.out::println);

		System.out.println("------limit 5------");
		Stream.of(arr).limit(5).forEach(System.out::println);

		System.out.println("------skip 5------");
		Stream.of(arr).skip(5).forEach(System.out::println);

		System.out.println("------distinct------");
		Stream.of(arr).distinct().forEach(System.out::println);

		System.out.println("------sorted------");
		Stream.of(arr).sorted().forEach(System.out::println);

		System.out.println("------anyMatch (even numbers?)------");
		boolean anyEven = Stream.of(arr).anyMatch(num -> num % 2 == 0);
		System.out.println(anyEven);

		System.out.println("------allMatch (positive numbers?)------");
		boolean allPositive = Stream.of(arr).allMatch(num -> num > 0);
		System.out.println(allPositive);

		System.out.println("------noneMatch (greater than 1 million?)------");
		boolean noneBig = Stream.of(arr).noneMatch(num -> num > 1_000_000);
		System.out.println(noneBig);

		System.out.println("------findFirst------");
		System.out.println(Stream.of(arr).filter(num -> num > 25).findFirst().get());

		System.out.println("------findAny------");
		Optional<Integer> any = Stream.of(arr).findAny();
		System.out.println(any.orElse(null));

		Integer[] nums = { 54, 68, 99, 102, 343, 496, 678, 8674, 75686, 81, 120, 333, 999 };
		List<Integer> numList = Arrays.asList(nums);

		System.out.println("------multiples of 3 with skip & limit------");
		numList.stream().filter(num -> num % 3 == 0).distinct().skip(3).limit(3).forEach(System.out::println);

		System.out.println("------sorted reverse order------");
		numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("------sorted ascending order------");
		numList.stream().sorted().forEach(System.out::println);

		String[] names = { "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah" };
		List<String> listNames = Arrays.stream(names).collect(Collectors.toList());
		Arrays.stream(names).filter(name -> name.length() >= 5).forEach(System.out::println);
		System.out.println();
		Arrays.stream(names).filter(name -> name.length() >= 2).filter(name -> name.startsWith("A"))
				.forEach(System.out::println);
		
		
		
		Employee e1 = new Employee(101,"Alice","Software Engineer", 75000, "IT");
		Employee e2 = new Employee(1017, "Geo", "Manager", 340000, "Accounts");
        Employee e3 = new Employee(102, "Bob", "HR Manager", 65000, "HR");
        Employee e4 = new Employee(103, "Charlie", "Data Analyst", 72000, "Analytics");
        Employee e5 = new Employee(104, "David", "Project Manager", 90000, "Operations");
        Employee e6 = new Employee(105, "Eve", "QA Engineer", 60000, "Testing");
        Employee e7 = new Employee(106, "Frank", "DevOps Engineer", 80000, "Infrastructure");
        
        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(101, "Alice", "Software Engineer", 75000, "IT"));
        empList.add(new Employee(102, "Bob", "manager", 65000, "HR"));
        empList.add(new Employee(103, "Charlie", "Data Analyst", 72000, "Analytics"));
        empList.add(new Employee(104, "David", "Project Manager", 90000, "Operations"));
        empList.add(new Employee(105, "Eve", "QA Engineer", 60000, "Testing"));
        empList.add(new Employee(106, "Frank", "DevOps Engineer", 80000, "IT"));
        empList.add(new Employee(107, "Grace", "Recruiter", 55000, "HR"));
        empList.add(new Employee(108, "Hannah", "Business Analyst", 70000, "Analytics"));
        empList.add(new Employee(109, "Ian", "System Admin", 68000, "Infrastructure"));
        empList.add(new Employee(110, "Jack", "Software Engineer", 77000, "IT"));
        empList.add(new Employee(111, "Karen", "QA Engineer", 61000, "Testing"));
        empList.add(new Employee(112, "Leo", "Operations Lead", 95000, "Operations"));
        empList.add(new Employee(113, "Mona", "Data Scientist", 88000, "Analytics"));
        empList.add(new Employee(114, "Nina", "HR Executive", 50000, "HR"));
        empList.add(new Employee(115, "Oscar", "Cloud Architect", 120000, "IT"));
        empList.stream().filter(emp->emp.getSalary()>50000).forEach(System.out::println);
//        empList.stream().filter(emp->emp.getJobDesignation().equals("manager"))
//        .sorted((e1,e2)-e1.getName().compareToIgnoreCase(e2.getName()))
//        .forEach(System.out::println);

	}
}
