package com.practice.java.oops;

public class Watchman {

    private String watchmanRollNumber;
    private String watchmanName;
    private int watchmanSalary;
    private double watchmanHeight;
    private char watchmanGrade;

    public void setWatchmanData(String rollNumber, String name, int salary, double height){
        watchmanRollNumber = rollNumber;
        watchmanName = name;
        watchmanSalary = salary;
        watchmanHeight = height;
    }

    public String toString(){
        return "Watch Man [watchmanRollNumber = " + watchmanRollNumber + " , watchmanName = " + watchmanName + " , watchmanSalary = " + watchmanSalary + " , watchmanHeight = " + watchmanHeight + " , watchmanGrade = " + watchmanGrade + " ]";
    }

    public void calculationWatchmanGrade(){
        if (watchmanSalary >= 100000){
            watchmanGrade  = 'A';
        } else if (watchmanSalary >= 15000) {
            watchmanGrade = 'B';
        } else if (watchmanSalary >= 20000) {
            watchmanGrade = 'C';
        } else if (watchmanSalary >= 25000) {
            watchmanGrade = 'D';
        } else {
            watchmanGrade = 'E';
        }
    }
}
