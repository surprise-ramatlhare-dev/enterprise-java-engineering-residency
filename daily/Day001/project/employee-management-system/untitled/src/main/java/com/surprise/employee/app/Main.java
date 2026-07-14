package com.surprise.employee.app;

import com.surprise.employee.model.Employee;
import com.surprise.employee.service.EmployeeService;

public class Main {

    public static void main(String[] args) {

        // Create the EmployeeService
        EmployeeService service = new EmployeeService();

        // Add employees
        service.addEmployee(new Employee(1001, "John", "IT", 35000));
        service.addEmployee(new Employee(1002, "Mary", "Finance", 42000));
        service.addEmployee(new Employee(1003, "Surprise", "Software Development", 50000));
        service.addEmployee(new Employee(1004, "Sarah", "HR", 31000));

        // Display all employees
        service.displayEmployees();

        // Display departments
        service.displayDepartments();

        // Count employees
        service.countEmployees();

        // Search employee
        System.out.println("\n===== SEARCH EMPLOYEE =====");

        Employee employee = service.searchEmployee(1003);

        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

        // Remove employee
        System.out.println("\n===== REMOVE EMPLOYEE =====");

        service.removeEmployee(1002);

        // Display employees again
        service.displayEmployees();

        // Count again
        service.countEmployees();

    }

}