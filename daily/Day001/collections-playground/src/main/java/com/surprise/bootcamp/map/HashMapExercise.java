package com.surprise.bootcamp.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {

    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();

        employees.put(1001, "John");
        employees.put(1002, "Mary");
        employees.put(1003, "Surprise");
        employees.put(1004, "Peter");

        System.out.println("Employees:");
        System.out.println(employees);

        System.out.println("\nEmployee 1002:");
        System.out.println(employees.get(1002));

        System.out.println("\nContains key 1003?");
        System.out.println(employees.containsKey(1003));

        System.out.println("\nContains employee Sarah?");
        System.out.println(employees.containsValue("Sarah"));

        System.out.println("\nTotal Employees:");
        System.out.println(employees.size());

        employees.remove(1004);

        System.out.println("\nAfter removing Peter:");
        System.out.println(employees);
    }
}