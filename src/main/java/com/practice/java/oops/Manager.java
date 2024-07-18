package com.practice.java.oops;

public class Manager {

    String managerRollNumber;
    String managerName;
    double managerHeight;
    String managerAddress;
    double managerRating;

    public void setManagerData(String rollNumber, String name, double height, String address, double rating){
        this.managerRollNumber = rollNumber;
        this.managerName = name;
        this.managerHeight = height;
        this.managerAddress = address;
        this.managerRating = rating;
    }

    public String toString(){
        return "Manager {managerRollNumber =" + managerRollNumber + " , Name = "+ managerName + ", Height = "+ managerHeight + " , Address = "+ managerAddress + " , Rating = "+ managerRating + "}";
    }
}
