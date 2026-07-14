package com.surprise.bootcamp.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayVsCollections {

    public static void main(String[] args) {

        // Arrays
        String[] employeesArray = {"John", "Mary", "Surprise"};

        System.out.println("=== Array ===");
        for (String employee : employeesArray) {
            System.out.println(employee);
        }

        // Collections
        List<String> employeesList = new ArrayList<>();

        employeesList.add("John");
        employeesList.add("Mary");
        employeesList.add("Surprise");
        employeesList.add("Peter");

        System.out.println("\n=== ArrayList ===");
        for (String employee : employeesList) {
            System.out.println(employee);
        }
    }
}