package com.demo.nov24;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee name=" + name + ", salary=" + salary ;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}