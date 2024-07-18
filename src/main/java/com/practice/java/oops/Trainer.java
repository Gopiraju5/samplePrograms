package com.practice.java.oops;

public class Trainer {

    int id;
    String name;
    double baseSalary;
    double HasPer;
    double DaPer;
    int batchCount;
    double perkPerBatch;

    public Trainer(int id, String name, double baseSalary, double hasPer, double daPer, int batchCount, double perkPerBatch) {
        super();
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        HasPer = hasPer;
        DaPer = daPer;
        this.batchCount = batchCount;
        this.perkPerBatch = perkPerBatch;
    }

    public double calculationGrossSalary() {
        return baseSalary + HasPer + DaPer + (batchCount * perkPerBatch);
    }
}
