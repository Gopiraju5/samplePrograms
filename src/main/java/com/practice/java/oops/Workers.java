package com.practice.java.oops;

public class Workers {

    String workerRollNumber;
    String workerName;
    float workerHeight;
    float workerRating;
    static String workerCompany = "TATA";
    static String workerRole = "MANAGER";

    public void setWorkerData(String rollNumber, String name, float height, float rating){
        workerRollNumber = rollNumber;
        workerName = name;
        workerHeight = height;
        workerRating = rating;
    }

    public void getWorkerData(){
        System.out.println("Worker Roll Number is: " + this.workerRollNumber);
        System.out.println("Worker Name is: "+ this.workerName);
        System.out.println("Worker Height is: "+ this.workerHeight);
        System.out.println("Worker Rating is: "+ this.workerRating);
        System.out.println("Worker Company is: " + Workers.workerCompany);
        System.out.println("Worker Role is: "+ Workers.workerRole);
    }
}
