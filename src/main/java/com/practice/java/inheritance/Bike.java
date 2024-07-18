package com.practice.java.inheritance;

public class Bike {

    private int bikeNo;
    private String bikeName;
    private String bikeColor;
    private String bikeCapacity;

    public Bike(int bikeNo, String bikeName, String bikeColor, String bikeCapacity) {
        super();
        this.bikeNo = bikeNo;
        this.bikeName = bikeName;
        this.bikeColor = bikeColor;
        this.bikeCapacity = bikeCapacity;
    }

    public String toString() {
        return "Bike {bikeNo = " + bikeNo +
                " , bikeName = " + bikeName +
                " , bikeColor = " + bikeColor +
                " , bikeCapacity = " + bikeCapacity +
                "}";
    }
}
