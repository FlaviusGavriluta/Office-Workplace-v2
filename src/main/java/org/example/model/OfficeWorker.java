package org.example.model;

import org.example.enums.EmployeeType;

public class OfficeWorker extends Employee {
    private EmployeeType employeeType;

    public OfficeWorker(String name, String groupName, EmployeeType employeeType) {
        super(name, groupName);
        this.employeeType = employeeType;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public double monthlySalary() {
        return EmployeeType.JUNIOR.equals(employeeType) ? 1250 : 1700;
    }
}