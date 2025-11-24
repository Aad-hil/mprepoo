package com.demo.Maven;

public class Employee {
	public Employee(int emp_ID, String empName, String desg, String mob) {
		super();
		this.emp_ID = emp_ID;
		this.empName = empName;
		this.desg = desg;
		this.mob = mob;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmp_ID() {
		return emp_ID;
	}

	public void setEmp_ID(int emp_ID) {
		this.emp_ID = emp_ID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	private int emp_ID;
	private String empName;
	private String desg;
	private String mob;

	@Override
	public String toString() {
		return "Employee [emp_ID=" + emp_ID + ", empName=" + empName + ", desg=" + desg + ", mob=" + mob + "]";
	}

}
