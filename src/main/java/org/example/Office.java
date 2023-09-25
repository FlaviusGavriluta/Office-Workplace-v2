package org.example;

import org.example.enums.EmployeeType;
import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<Employee> employees;

    public Office() {
        this.employees = new ArrayList<>();
        createAndAddEmployees();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printYearlySalaries() {
        employees.forEach(employee -> {
            System.out.println("Employee:" + employee.getName() +
                    " , Monthly Salary: $" + employee.monthlySalary() +
                    ", Yearly Salary: $" + employee.monthlySalary() * 12);
        });
    }

    private void createAndAddEmployees() {
        // Create groups
        Group gr1 = new Group("Sales1");
        Group gr2 = new Group("Sales2");
        Group gr3 = new Group("Office1");

        // Create and add SalesEmployees for group 1
        addSalesEmployees(gr1, List.of("Alice", "Tom", "Bob"));

        // Create and add SalesEmployees for group 2
        addSalesEmployees(gr2, List.of("Aly", "Luke", "Bill"));

        // Create and add OfficeWorkers for group 3
        addOfficeWorkers(gr3, List.of("John", "Jimm", "Jack", "Wex", "Max", "Benn"));

        // Create and add GroupLeads
        addGroupLead(gr1, "Mattew");
        addGroupLead(gr2, "Dan");
        addGroupLead(gr3, "Oliver");
    }

    private void addSalesEmployees(Group group, List<String> names) {
        for (String name : names) {
            SalesEmployee employee = new SalesEmployee(name, group.getName());
            group.addMember(employee);
            addEmployee(employee);
        }
    }

    private void addOfficeWorkers(Group group, List<String> names) {
        // Here, I'm assuming that they are all SENIOR for simplicity. Modify as necessary.
        for (String name : names) {
            OfficeWorker employee = new OfficeWorker(name, group.getName(), EmployeeType.SENIOR);
            group.addMember(employee);
            addEmployee(employee);
        }
    }

    private void addGroupLead(Group group, String name) {
        GroupLead lead = new GroupLead(name, group.getName(), group.getMembers().size());
        group.setAssignedLeader(lead);
        addEmployee(lead);
    }
}