package com.practice.java.oops;

// Copy Construction
public class Employee03 {

    private String employee03Id;
    private String employee03Name;

    public Employee03(String employee03Id, String employee03Name) {
        super();
        this.employee03Id = employee03Id;
        this.employee03Name = employee03Name;
    }

    public String toString() {
        return "Employee {employee03Id = " + employee03Id +
                " , employee03Name = " + employee03Name + " }";
    }

    public String getEmployee03Id() {
        return employee03Id;
    }

    public String getEmployee03Name() {
        return employee03Name;
    }
}
