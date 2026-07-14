package com.surprise.bootcamp.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {

        List<String> employees = new ArrayList<>();

        // Add elements
        employees.add("John");
        employees.add("Mary");
        employees.add("Surprise");
        employees.add("Peter");

        System.out.println("Employees:");
        System.out.println(employees);

        // Get an element
        System.out.println("\nFirst employee:");
        System.out.println(employees.get(0));

        // Replace an element
        employees.set(1, "Sarah");

        System.out.println("\nAfter replacing Mary:");
        System.out.println(employees);

        // Check size
        System.out.println("\nNumber of employees:");
        System.out.println(employees.size());

        // Check if an employee exists
        System.out.println("\nContains Surprise?");
        System.out.println(employees.contains("Surprise"));

        // Remove an employee
        employees.remove("Peter");

        System.out.println("\nAfter removing Peter:");
        System.out.println(employees);

        // Is the list empty?
        System.out.println("\nIs the list empty?");
        System.out.println(employees.isEmpty());

        // Loop through the list
        System.out.println("\nLooping through employees:");

        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}