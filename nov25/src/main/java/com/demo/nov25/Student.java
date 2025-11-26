package com.demo.nov25;

public class Student {

	private int id;
	private String name;

	public Student(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		Course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String Course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Course=" + Course + "]";
	}

}
