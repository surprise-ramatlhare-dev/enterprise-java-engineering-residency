package com.surprise.employee.service;

import com.surprise.employee.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeService {

    // Stores all employees
    private final List<Employee> employees = new ArrayList<>();

    // Stores unique departments
    private final Set<String> departments = new HashSet<>();

    // Stores employees by ID
    private final Map<Integer, Employee> employeeMap = new HashMap<>();

    /**
     * Adds a new employee.
     */
    public void addEmployee(Employee employee) {

        employees.add(employee);

        departments.add(employee.getDepartment());

        employeeMap.put(employee.getId(), employee);

    }

    /**
     * Displays all employees.
     */
    public void displayEmployees() {

        System.out.println("\n===== EMPLOYEES =====");

        for (Employee employee : employees) {

            System.out.println(employee);

        }

    }

    /**
     * Displays all departments.
     */
    public void displayDepartments() {

        System.out.println("\n===== DEPARTMENTS =====");

        for (String department : departments) {

            System.out.println(department);

        }

    }

    /**
     * Searches for an employee by ID.
     */
    public Employee searchEmployee(int id) {

        return employeeMap.get(id);

    }

    /**
     * Removes an employee by ID.
     */
    public void removeEmployee(int id) {

        Employee employee = employeeMap.remove(id);

        if (employee != null) {

            employees.remove(employee);

            System.out.println(employee.getName() + " removed successfully.");

        } else {

            System.out.println("Employee not found.");

        }

    }

    /**
     * Displays the total number of employees.
     */
    public void countEmployees() {

        System.out.println("\nTotal Employees: " + employees.size());

    }

}