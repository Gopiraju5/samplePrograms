package com.practice.java.oops;

public class Manager02 {

    int id;
    String name;
    double baseSalary;
    double HasPer;
    double DaPer;
    double projectAllowance;

    public Manager02(int id, String name, double baseSalary, double hasPer, double daPer, double projectAllowance) {
        super();
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        HasPer = hasPer;
        DaPer = daPer;
        this.projectAllowance = projectAllowance;
    }

    public double calculationGrossSalary() {
        return baseSalary + HasPer + DaPer + projectAllowance;
    }
}
