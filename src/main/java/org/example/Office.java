package org.example;

import org.example.enums.EmployeeType;
import org.example.model.Group;
import org.example.model.GroupLead;
import org.example.model.OfficeWorker;
import org.example.model.SalesEmployee;

public class Office {
    private Workplace workplace;

    public Office() {
        this.workplace = new Workplace();

        Group gr1 = createGroup("Sales1");
        Group gr2 = createGroup("Sales2");
        Group gr3 = createGroup("Office1");

        createAndAddEmployees(gr1, gr2, gr3);

        workplace.printYearlySalaries();
    }

    private Group createGroup(String name) {
        Group group = new Group(name);
        workplace.addGroup(group);
        return group;
    }

    private void createAndAddEmployees(Group gr1, Group gr2, Group gr3) {
        // Create and add SalesEmployees for group 1
        addSalesEmployees(gr1, "Alice", "Tom", "Bob");

        // Create and add SalesEmployees for group 2
        addSalesEmployees(gr2, "Aly", "Luke", "Bill");

        // Create and add OfficeWorkers for group 3
        addOfficeWorkers(gr3, "John", "Jimm", "Jack", "Wex", "Max", "Benn");

        // Create and add GroupLeads
        addGroupLead(gr1, "Mattew");
        addGroupLead(gr2, "Dan");
        addGroupLead(gr3, "Oliver");
    }

    private void addSalesEmployees(Group group, String... names) {
        for (String name : names) {
            SalesEmployee employee = new SalesEmployee(name, group.getName());
            workplace.addEmployee(employee);
            group.addMember(employee);
        }
    }

    private void addOfficeWorkers(Group group, String... names) {
        // Here, I'm assuming that they are all SENIOR for simplicity. Modify as necessary.
        for (String name : names) {
            OfficeWorker employee = new OfficeWorker(name, group.getName(), EmployeeType.SENIOR);
            workplace.addEmployee(employee);
            group.addMember(employee);
        }
    }

    private void addGroupLead(Group group, String name) {
        GroupLead lead = new GroupLead(name, group.getName());
        lead.setNumberOfEmployees(group.getMembers().size());
        workplace.addEmployee(lead);
        group.setAssignedLeader(lead);
    }
}