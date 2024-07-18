package com.practice.java.oops;

public class Employee02 {

    private int employee02Id;
    private String employee02Name;
    private String employee02Role;
    private double employee02Salary;

    public Employee02(int employee02Id, String employee02Name, String employee02Role, double employee02Salary) {
        super();
        this.employee02Id = employee02Id;
        this.employee02Name = employee02Name;
        this.employee02Role = employee02Role;
        this.employee02Salary = employee02Salary;
    }

    public void setEmployee02Id(int employee02Id) {
        this.employee02Id = employee02Id;
    }

    public int getEmployee02Id() {
        return employee02Id;
    }

    public void setEmployee02Name(String employee02Name) {
        this.employee02Name = employee02Name;
    }

    public String getEmployee02Name() {
        return employee02Name;
    }

    public void setEmployee02Role(String employee02Role) {
        this.employee02Role = employee02Role;
    }

    public String getEmployee02Role() {
        return employee02Role;
    }

    public void setEmployee02Salary(double employee02Salary) {
        this.employee02Salary = employee02Salary;
    }

    public double getEmployee02Salary() {
        return employee02Salary;
    }

    public String toString() {
        return "Employee {employeeId = " + employee02Id +
                " , employeeName = " + employee02Name +
                " , employeeRole = " + employee02Role +
                " , employeeSalary = " + employee02Salary + " }";
    }

    public static void main(String[] args) {
        Employee02 e1 = new Employee02(1001, "Sai", "Java", 20000.00);
        System.out.println(e1);

        System.out.println("=========================");

        Employee02 e2 = new Employee02(1002, "Kumar", "Tester", 30000.00);
        System.out.println(e2);
        e2.setEmployee02Role("MySql");
        System.out.println(e2);
    }
}
