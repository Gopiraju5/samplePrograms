package com.practice.java.oops;

public class BankCustomer {

    private double balance = 2000;

    public void deposit(int deposit){
        if (deposit <= 0){
            System.out.println("Amount cannot be Deposit");
        }
        else {
            balance = balance + deposit;
            System.out.println("Balance after deposit: " + balance);
        }
    }

    public void withdraw(int withdraw){
        balance = balance - withdraw;
        System.out.println("Balance after withdraw: " + balance);
    }
}
