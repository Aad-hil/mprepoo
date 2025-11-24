package com.demo.Maven;

import com.demo.Maven.Student.College;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(123,"aa",90);
		Student.College c= new Student().new College("ss","loc",1008);
		c.display();

	}

}
