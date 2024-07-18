package com.practice.java.oops;

// copy Construction
public class Manager01 {

    private String managerId;
    private String managerName;

    public Manager01(Employee03 emp) {
        this.managerId = emp.getEmployee03Id();
        this.managerName = emp.getEmployee03Name();
    }

    public String toString() {
        return "Manager {managerId = " + managerId +
                " , managerName = " + managerName + " }";
    }

    public static void main(String[] args) {
        Employee03 e1 = new Employee03("EMP1001", "Sai");
        Manager01 m1 = new Manager01(e1);
        System.out.println(m1);
    }
}
