package org.example.model;

import java.util.Random;

public class SalesEmployee extends Employee {
    public SalesEmployee(String name, String groupName) {
        super(name, groupName);
    }

    @Override
    public double monthlySalary() {
        return new Random().nextInt(501) + 1500;
    }
}