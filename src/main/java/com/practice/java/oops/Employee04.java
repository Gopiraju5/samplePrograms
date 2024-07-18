package com.practice.java.oops;

public class Employee04 {

    int id;
    String name;
    double baseSalary;
    double HarPer;
    double DaPer;

    public Employee04(int id, String name, double baseSalary, double harPer, double daPer) {
        super();
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        HarPer = harPer;
        DaPer = daPer;
    }

    public double calculateGrossSalary() {
        return baseSalary + HarPer + DaPer;
    }
}
