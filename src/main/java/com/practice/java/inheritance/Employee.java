package com.practice.java.inheritance;

public class Employee {

    protected int employeeNo;
    protected String employeeName;
    protected String employeeAddress;

    public Employee(int employeeNo, String employeeName, String employeeAddress) {
        super();
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
    }

    public String toString() {
        return "Employee {employeeId = " + employeeNo +
                " , employeeName = " + employeeName +
                " , employeeAddress = " + employeeAddress +
                "}";
    }
}
