package service;

import employee.Employee;
import java.util.*;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("✅ Employee added successfully!");
    }

    public void deleteEmployee(int id) {
        boolean removed = employees.removeIf(e -> e.getId() == id);
        if (removed)
            System.out.println("🗑️ Employee deleted successfully!");
        else
            System.out.println("⚠️ Employee not found!");
    }

    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("⚠️ No employees available!");
            return;
        }

        System.out.println("\n--- Employee List ---");
        for (Employee e : employees) {
            e.displayInfo();
        }
    }

    public void displayAlphabetically() {
        if (employees.isEmpty()) {
            System.out.println("⚠️ No employees available!");
            return;
        }

        List<Employee> sorted = new ArrayList<>(employees);
        Collections.sort(sorted);
        System.out.println("\n--- Employees in Alphabetical Order ---");
        for (Employee e : sorted) {
            e.displayInfo();
        }
    }

    public void modifyEmployee(int id, String newName, String newDept, double newSalary) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                e.setName(newName);
                e.setDepartment(newDept);
                e.setSalary(newSalary);
                System.out.println("✅ Employee data updated successfully!");
                return;
            }
        }
        System.out.println("⚠️ Employee not found!");
    }
}
