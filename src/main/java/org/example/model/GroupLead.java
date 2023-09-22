package org.example.model;

public class GroupLead extends Employee {
    private int numberOfEmployees;

    public GroupLead(String name, String groupName, int numberOfEmployees) {
        super(name, groupName);
        this.numberOfEmployees = numberOfEmployees;
    }

    public GroupLead(String name, String groupName) {
        super(name, groupName);
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double monthlySalary() {
        return 1800 + (200 * numberOfEmployees);
    }
}