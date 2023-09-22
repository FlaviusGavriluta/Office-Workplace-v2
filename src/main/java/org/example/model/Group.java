package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private GroupLead assignedLeader;
    private List<Employee> members;

    public Group(String name, GroupLead assignedLeader) {
        this.name = name;
        this.members = new ArrayList<>();
        this.assignedLeader = assignedLeader;
    }

    public Group(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addMember(Employee employee) {
        members.add(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getMembers() {
        return members;
    }

    public void setMembers(List<Employee> members) {
        this.members = members;
    }

    public GroupLead getAssignedLeader() {
        return assignedLeader;
    }

    public void setAssignedLeader(GroupLead assignedLeader) {
        this.assignedLeader = assignedLeader;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", employees=" + members +
                ", assignedLeader=" + assignedLeader +
                '}';
    }
}