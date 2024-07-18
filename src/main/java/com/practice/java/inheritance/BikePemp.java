package com.practice.java.inheritance;

public class BikePemp extends Bike {

    private String performance;
    private String quality;
    private String running;

    public BikePemp(int bikeNo, String bikeName, String bikeColor, String bikeCapacity, String performance, String quality, String running) {
        super(bikeNo, bikeName, bikeColor, bikeCapacity);
        this.performance = performance;
        this.quality = quality;
        this.running = running;
    }

    public String toString() {
        return "" + super.toString() +
                "Bike Pemp {performance = " + performance +
                " , quality = " + quality +
                " , running = " + running +
                "}";
    }
}
