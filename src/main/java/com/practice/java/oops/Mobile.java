package com.practice.java.oops;

public class Mobile {

    private int mobileId;
    private String mobileName;
    private String mobileColor;
    private double mobileRate;
    private String mobileRAM;
    private String mobileROM;
    private int mobileCapacity;

    public Mobile(int mobileId, String mobileName, String mobileColor, double mobileRate, String mobileRAM, String mobileROM, int mobileCapacity) {
        super();
        this.mobileId = mobileId;
        this.mobileName = mobileName;
        this.mobileColor = mobileColor;
        this.mobileRate = mobileRate;
        this.mobileRAM = mobileRAM;
        this.mobileROM = mobileROM;
        this.mobileCapacity = mobileCapacity;
    }

    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public int getMobileId() {
        return mobileId;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileColor(String mobileColor) {
        this.mobileColor = mobileColor;
    }

    public String getMobileColor() {
        return mobileColor;
    }

    public void setMobileRate(double mobileRate) {
        this.mobileRate = mobileRate;
    }

    public double getMobileRate() {
        return mobileRate;
    }

    public void setMobileRAM(String mobileRAM) {
        this.mobileRAM = mobileRAM;
    }

    public String getMobileRAM() {
        return mobileRAM;
    }

    public void setMobileROM(String mobileROM) {
        this.mobileROM = mobileROM;
    }

    public String getMobileROM() {
        return mobileROM;
    }

    public void setMobileCapacity(int mobileCapacity) {
        this.mobileCapacity = mobileCapacity;
    }

    public int getMobileCapacity() {
        return mobileCapacity;
    }

    public String toString() {
        return "Mobile {mobileId = " + mobileId +
                " , mobileName = " + mobileName +
                " , mobileColor = " + mobileColor +
                " , mobileRate = " + mobileRate +
                " , mobileRAM = " + mobileRAM +
                " , mobileROM = " + mobileROM +
                " , mobileCapacity = " + mobileCapacity +
                "}";
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile(2001, "MI", "Black", 15000, "1GB", "2GB", 6000);
        System.out.println(m1);
        System.out.println("========================");

        m1.setMobileColor("Pink");
        System.out.println(m1);

        System.out.println("=======================");

        m1.setMobileName("OPPO");
        m1.setMobileColor("White");
        System.out.println(m1);
    }
}
