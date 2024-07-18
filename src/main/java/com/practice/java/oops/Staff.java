package com.practice.java.oops;

public class Staff {

    private String staffRollNumber;
    private String staffName;
    private double staffSalary;
    // HAS-A Relation
    private Institute ins;

    public Staff(String staffRollNumber, String staffName, double staffSalary, Institute ins) {
        super();
        this.staffRollNumber = staffRollNumber;
        this.staffName = staffName;
        this.staffSalary = staffSalary;
        this.ins = ins;
    }

    public String toString() {
        return "Staff {staffRollNumber = " + staffRollNumber +
                " , staffName = " + staffName +
                " , staffSalary = " + staffSalary +
                " , institute = " + ins + " }";
    }
}
