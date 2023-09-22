package org.example;

import org.example.model.Employee;
import org.example.model.Group;

import java.util.ArrayList;
import java.util.List;

public class Workplace {
    private List<Employee> employees;
    private List<Group> groups;

    public Workplace() {
        this.employees = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void printYearlySalaries() {
        employees.forEach(employee -> {
            System.out.println("Employee:" + employee.getName() +
                    " , Monthly Salary: $" + employee.monthlySalary() +
                    ", Yearly Salary: $" + employee.monthlySalary() * 12);
        });
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Workplace{" +
                "employees=" + employees +
                ", groups=" + groups +
                '}';
    }
}