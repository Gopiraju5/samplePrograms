package com.practice.java.oops;

public class Driver {
    String driverNumber;
    String driverName;
    double height;
    double rating;

    public void talkOwner(){
        System.out.println("My DriverNumber is: " + driverNumber);
        System.out.println("My DriverName is: " + driverName);
        System.out.println("My height is: " + height);
        System.out.println("My rating is: " + rating);
    }

    public void driverOwner(){
        System.out.println(driverNumber + "Driver the Lorry");
    }

    public static void main(String[] args) {
        Driver dr = new Driver();
        dr.driverNumber = "DR1002";
        dr.driverName = "Mahesh Babu";
        dr.height = 5.5;
        dr.rating = 2.5;
        dr.driverOwner();
    }
}
