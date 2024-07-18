package com.practice.java.inheritance;

public class Son extends Father {

    protected double balance = 15000;

    public void getBalance() {

        System.out.println("Son Balance is: " + balance);
        System.out.println("Father Balance is: " + super.balance);
    }
}
