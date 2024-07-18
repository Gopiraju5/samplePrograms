package com.practice.java.oops;

public class WorkersDemo {
    public static void main(String[] args) {

        Workers gopi = new Workers();

        gopi.setWorkerData("WD001","Gopi Raju", 2.5f, 3.5f);
        gopi.getWorkerData();

        System.out.println("=======================");

        Workers yesu = new Workers();

        yesu.setWorkerData("WD002", "Yesu Babu", 3.5f, 5.5f);
        yesu.getWorkerData();

        System.out.println("=================================");


        Workers swathi = new Workers();

        swathi.setWorkerData("WD003", "Swathi", 6.6f, 5.8f);
        swathi.getWorkerData();
    }
}
