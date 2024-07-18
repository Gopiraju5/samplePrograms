package com.practice.java.oops;

public class Hostel {

    private String hostelRollNumber;
    private String hostelName;
    private String hostelAddress;
    private int hostelPhoneNumber;

    public Hostel(String hostelRollNumber, String hostelName, String hostelAddress, int hostelPhoneNumber) {
        super();
        this.hostelRollNumber = hostelRollNumber;
        this.hostelName = hostelName;
        this.hostelAddress = hostelAddress;
        this.hostelPhoneNumber = hostelPhoneNumber;
    }

    public String toString() {
        return "Hostel {hostelRollNumber = " + hostelRollNumber +
                " , hostelName = " + hostelName +
                " , hostelAddress = " + hostelAddress +
                " , hostelPhoneNumber = " + hostelPhoneNumber + "}";
    }
}
