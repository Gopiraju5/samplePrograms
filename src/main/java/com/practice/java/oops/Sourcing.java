package com.practice.java.oops;

public class Sourcing {

    int id;
    String name;
    double baseSalary;
    double HasPer;
    double DaPer;
    int enrollmentTarget;
    int enrollmentReached;
    double perkPerEnrollment;

    public Sourcing(int id, String name, double baseSalary, double hasPer, double daPer, int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
        super();
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        HasPer = hasPer;
        DaPer = daPer;
        this.enrollmentTarget = enrollmentTarget;
        this.enrollmentReached = enrollmentReached;
        this.perkPerEnrollment = perkPerEnrollment;
    }

    public double calculationGrossSalary() {
        return baseSalary + HasPer + DaPer + ((enrollmentReached / enrollmentTarget) * 100) * perkPerEnrollment;
    }
}
