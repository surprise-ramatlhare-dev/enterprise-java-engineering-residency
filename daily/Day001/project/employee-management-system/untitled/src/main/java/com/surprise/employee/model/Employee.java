package com.surprise.employee.model;

public class Employee {

    // ==========================
    // Fields (Attributes)
    // ==========================

    private int id;
    private String name;
    private String department;
    private double salary;

    // ==========================
    // Constructor
    // ==========================

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // ==========================
    // Getters
    // ==========================

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // ==========================
    // toString()
    // ==========================

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

}