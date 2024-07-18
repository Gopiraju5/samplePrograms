package com.practice.java.oops;

public class HasA_Relation02 {
    public static void main(String[] args) {
        Hostel hostel = new Hostel("HRN10001", "Good", "SR Nagar", 954158);

        HostelStaff h1 = new HostelStaff(10001, "Kavya", "Cooking", hostel);
        System.out.println(h1);
    }
}
