package com.practice.java.oops;

public class TelephoneDemo {
    public static void main(String[] args) {
        Telephone tele1 = new Telephone();

        tele1.setTelephoneData("TP0001", "Telefon", "Black", 4.5, 150000);
        tele1.calculationTelephoneBill();
        System.out.println(tele1);
    }
}
