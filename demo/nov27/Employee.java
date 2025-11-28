package com.demo.nov27;

public class Employee {
    // Fields (attributes)
    private int id;
    private String name;
    private String jobDesignation;
    private double salary;
    private String department;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(int id, String name, String jobDesignation, double salary, String department) {
        this.id = id;
        this.name = name;
        this.jobDesignation = jobDesignation;
        this.salary = salary;
        this.department = department;
    }

    // Getters and Setters
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

    public String getJobDesignation() {
        return jobDesignation;
    }

    public void setJobDesignation(String jobDesignation) {
        this.jobDesignation = jobDesignation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jobDesignation='" + jobDesignation + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
