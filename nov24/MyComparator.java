package com.demo.nov24;

@FunctionalInterface
interface MyComparator {
//	public static void sortBySalary(Employee[] employees) {
//        Arrays.sort(employees, (e1, e2) -> Integer.compare(e1.salary, e2.salary));
//    }
//
//    public static void displayEmployees(Employee[] employees) {
//        for (Employee e : employees) {
//            System.out.println(e.name + " - " + e.salary);
//        }
//    }
//	public int salcompare(Employee e1, Employee e2);
	public String namecompare(Employee e1, Employee e2);

}
