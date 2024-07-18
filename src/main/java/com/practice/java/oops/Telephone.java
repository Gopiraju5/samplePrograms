package com.practice.java.oops;

public class Telephone {

    private String telephoneRollNumber;
    private String telephoneName;
    private String telephoneColor;
    private double telephoneHeight;
    private int telephoneRecharge;
    private int telephoneRank;

    public void setTelephoneData(String rollNumber, String name, String color, double height, int recharge){
        telephoneRollNumber = rollNumber;
        telephoneName = name;
        telephoneColor = color;
        telephoneHeight = height;
        telephoneRecharge = recharge;
    }

    public String toString(){
        return "Telephone { telephoneRollNumber = "
                + telephoneRollNumber + " , telephoneName = "
                + telephoneName + " , telephoneColor = "
                + telephoneColor + " , telephoneHeight = "
                + telephoneHeight + " , telephoneRecharge = "
                + telephoneRecharge + " , telephoneRank = "
                + telephoneRank +
                " }";
    }

    public void calculationTelephoneBill(){
        if (telephoneRecharge >= 5000){
            telephoneRank = 1;
        } else if (telephoneRecharge >= 100000) {
            telephoneRank = 2;
        } else if (telephoneRecharge >= 500000) {
            telephoneRank = 3;
        } else if (telephoneRecharge >= 1000000) {
            telephoneRank = 4;
        } else {
            telephoneRank = 0;
        }
    }
}
