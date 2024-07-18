package com.practice.java.oops;

public class TaxUtil {

    // Employee04
    public double calculationTax(Employee04 employee04) {
        if (employee04.calculateGrossSalary() > 50000) {
            return employee04.calculateGrossSalary() * 0.20;
        } else {
            return employee04.calculateGrossSalary() * 0.05;
        }
    }

    // Manager02
    public double calculationTax(Manager02 manager02) {
        if (manager02.calculationGrossSalary() > 50000) {
            return manager02.calculationGrossSalary() * 0.20;
        } else {
            return manager02.calculationGrossSalary() * 0.5;
        }
    }

    //Trainer
    public double calculationTax(Trainer trainer) {
        if (trainer.calculationGrossSalary() > 50000) {
            return trainer.calculationGrossSalary() * 0.20;
        } else {
            return trainer.calculationGrossSalary() * 0.5;
        }
    }

    // Sourcing
    public double calculationTax(Sourcing sourcing) {
        if (sourcing.calculationGrossSalary() > 50000) {
            return sourcing.calculationGrossSalary() * 0.20;
        } else {
            return sourcing.calculationGrossSalary() * 0.5;
        }
    }

    public static void main(String[] args) {

        Employee04 e1 = new Employee04(1, "Sai", 40000, 3200, 2500);

        Manager02 m1 = new Manager02(2, "Leela", 75000, 3500, 4000, 10000);

        Trainer t1 = new Trainer(3, "Siva", 60000, 3500, 2800, 10, 250);

        Sourcing s1 = new Sourcing(4, "Mahesh", 80000, 3300, 2800, 100, 20, 70);

        TaxUtil tu = new TaxUtil();
        System.out.println("Employee Tax is: "+ tu.calculationTax(e1));
        System.out.println("Manager Tax is: "+ tu.calculationTax(m1));
        System.out.println("Trainer Tax is: "+ tu.calculationTax(t1));
        System.out.println("Sourcing Tax is: "+ tu.calculationTax(s1));
    }
}
