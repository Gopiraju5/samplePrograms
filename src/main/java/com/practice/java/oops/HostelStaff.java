package com.practice.java.oops;

public class HostelStaff {

    private int hostelStaffId;
    private String hostelStaffName;
    private String hotelStaffPurpose;
    //HAS-A Relation
    private Hostel hostel;

    public HostelStaff(int hostelStaffId, String hostelStaffName, String hotelStaffPurpose, Hostel hostel) {
        super();
        this.hostelStaffId = hostelStaffId;
        this.hostelStaffName = hostelStaffName;
        this.hotelStaffPurpose = hotelStaffPurpose;
        this.hostel = hostel;
    }

    public String toString() {
        return "Hostel Staff {hostelStaffId = " + hostelStaffId +
                " , hostelStaffName = " + hostelStaffName +
                " , hostelStaffPurpose = " + hotelStaffPurpose +
                " , hostel = " + hostel + " }";
    }
}
