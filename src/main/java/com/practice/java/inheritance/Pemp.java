package com.practice.java.inheritance;

public class Pemp extends Employee {

    protected String department;
    protected String designation;

    public Pemp(int employeeId, String employeeName, String employeeAddress, String department, String designation) {
        super(employeeId, employeeName, employeeAddress);
        this.department = department;
        this.designation = designation;
    }

    public String toString() {
        return "" + super.toString() + "Pemp {department = " + department +
                " , designation = " + designation + " }";
    }
}
