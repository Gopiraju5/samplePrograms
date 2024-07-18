package com.practice.java.oops;

public class BagDetail {

    private int bagDetailId;
    private String bagDetailName;
    private String bagDetailSize;
    private String bagDetailColor;
    private double bagDetailRate;
    private String bagDetailCompany;

    public BagDetail(int bagDetailId, String bagDetailName, String bagDetailSize, String bagDetailColor, double bagDetailRate, String bagDetailCompany) {
        super();
        this.bagDetailId = bagDetailId;
        this.bagDetailName = bagDetailName;
        this.bagDetailSize = bagDetailSize;
        this.bagDetailColor = bagDetailColor;
        this.bagDetailRate = bagDetailRate;
        this.bagDetailCompany = bagDetailCompany;
    }

    public void setBagDetailId(int bagDetailId) {
        this.bagDetailId = bagDetailId;
    }

    public int getBagDetailId() {
        return bagDetailId;
    }

    public void setBagDetailName(String bagDetailName) {
        this.bagDetailName = bagDetailName;
    }

    public String getBagDetailName() {
        return bagDetailName;
    }

    public void setBagDetailSize(String bagDetailSize) {
        this.bagDetailSize = bagDetailSize;
    }

    public String getBagDetailSize() {
        return bagDetailSize;
    }

    public void setBagDetailColor(String bagDetailColor) {
        this.bagDetailColor = bagDetailColor;
    }

    public String getBagDetailColor() {
        return bagDetailColor;
    }

    public void setBagDetailRate(double bagDetailRate) {
        this.bagDetailRate = bagDetailRate;
    }

    public double getBagDetailRate() {
        return bagDetailRate;
    }

    public void setBagDetailCompany(String bagDetailCompany) {
        this.bagDetailCompany = bagDetailCompany;
    }

    public String getBagDetailCompany() {
        return bagDetailCompany;
    }

    public String toString() {
        return "Bag Details {bagDetailId = " + bagDetailId +
                " , bagDetailName = " + bagDetailName +
                " , bagDetailSize = " + bagDetailSize +
                " , bagDetailColor = " + bagDetailColor +
                " ,bagDetailRate = " + bagDetailRate +
                " , bagDetailCompany = " + bagDetailCompany + " }";
    }

    public static void main(String[] args) {
        BagDetail b1 = new BagDetail(1001, "ABCD", "45Cm", "Black", 30000, "Tom");
        System.out.println(b1);

        System.out.println("=====================================");
        b1.setBagDetailColor("Pink");
        b1.setBagDetailCompany("MI");
        b1.setBagDetailRate(45000.00);
        System.out.println(b1);
    }
}
