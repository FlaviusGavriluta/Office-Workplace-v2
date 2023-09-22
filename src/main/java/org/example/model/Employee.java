package org.example.model;

public abstract class Employee {
    private int id;
    private static int count;
    private String name;
    private String groupName;

    public Employee(String name, String groupName) {
        this.id = ++count;
        this.name = name;
        this.groupName = groupName;
    }

    public abstract double monthlySalary();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
