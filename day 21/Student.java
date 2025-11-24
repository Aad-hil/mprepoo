package com.demo.Maven;

public class Student {

	private String stdName;
	private int stdID;
	private double marks;

	public Student(int stdid, String stdName, double marks) {
		super();
		this.stdName = stdName;
		this.stdID = stdid;
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdID() {
		return stdID;
	}

	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdID=" + stdID + ", marks=" + marks + "]";
	}

	public void setStdID(int stdID) {
		this.stdID = stdID;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	 class College {
		private String collegeName;
		private String address;

		public College() {
			super();
			// TODO Auto-generated constructor stub
		}
		static void display() {
			Student s = new Student();
			System.out.println(s.toString());
		}
		

		private int collegeCode;

		public College(String ccollegeName, String address, int collegeCode) {
			super();
			collegeName = ccollegeName;
			this.address = address;
			this.collegeCode = collegeCode;
		}

		@Override
		public String toString() {
			return "College [collegeName=" + collegeName + ", address=" + address + ", collegeCode=" + collegeCode
					+ "]";
		}
	}

}
