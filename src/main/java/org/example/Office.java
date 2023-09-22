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

        Group gr1 = new Group("Sales1");
        Group gr2 = new Group("Sales2");
        Group gr3 = new Group("Office1");

        GroupLead gl1 = new GroupLead("Mattew", gr1.getName());
        GroupLead gl2 = new GroupLead("Dan", gr2.getName());
        GroupLead gl3 = new GroupLead("Oliver", gr3.getName());

        SalesEmployee se1 = new SalesEmployee("Alice", gr1.getName());
        SalesEmployee se2 = new SalesEmployee("Tom", gr1.getName());
        SalesEmployee se3 = new SalesEmployee("Bob", gr1.getName());
        SalesEmployee se4 = new SalesEmployee("Aly", gr2.getName());
        SalesEmployee se5 = new SalesEmployee("Luke", gr2.getName());
        SalesEmployee se6 = new SalesEmployee("Bill", gr2.getName());

        OfficeWorker ow1 = new OfficeWorker("John", gr3.getName(), EmployeeType.JUNIOR);
        OfficeWorker ow2 = new OfficeWorker("Jimm", gr3.getName(), EmployeeType.SENIOR);
        OfficeWorker ow3 = new OfficeWorker("Jack", gr3.getName(), EmployeeType.SENIOR);
        OfficeWorker ow4 = new OfficeWorker("Wex", gr3.getName(), EmployeeType.SENIOR);
        OfficeWorker ow5 = new OfficeWorker("Max", gr3.getName(), EmployeeType.SENIOR);
        OfficeWorker ow6 = new OfficeWorker("Benn", gr3.getName(), EmployeeType.JUNIOR);

        this.workplace.addEmployee(se1);
        this.workplace.addEmployee(se2);
        this.workplace.addEmployee(se3);
        this.workplace.addEmployee(se4);
        this.workplace.addEmployee(se5);
        this.workplace.addEmployee(se6);
        this.workplace.addEmployee(ow1);
        this.workplace.addEmployee(ow2);
        this.workplace.addEmployee(ow3);
        this.workplace.addEmployee(ow4);
        this.workplace.addEmployee(ow5);
        this.workplace.addEmployee(ow6);
        this.workplace.addEmployee(gl1);
        this.workplace.addEmployee(gl2);
        this.workplace.addEmployee(gl3);

        gr1.addMember(se1);
        gr1.addMember(se2);
        gr1.addMember(se3);
        gr2.addMember(se4);
        gr2.addMember(se5);
        gr2.addMember(se6);
        gr3.addMember(ow1);
        gr3.addMember(ow2);
        gr3.addMember(ow3);
        gr3.addMember(ow4);
        gr3.addMember(ow5);
        gr3.addMember(ow6);

        gr1.setAssignedLeader(gl1);
        gr2.setAssignedLeader(gl2);
        gr3.setAssignedLeader(gl3);

        gl1.setNumberOfEmployees(gr1.getMembers().size());
        gl2.setNumberOfEmployees(gr2.getMembers().size());
        gl3.setNumberOfEmployees(gr3.getMembers().size());

        workplace.printYearlySalaries();
    }
}