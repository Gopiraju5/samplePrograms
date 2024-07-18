package com.practice.java.interface_demo;

public interface Bank {
    public void deposit(int amount);

    public void withdraw(int amount);
}

class Customer implements Bank {
    private double balance = 10000;

    @Override
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Amount can't be Deposited");
        } else {
            balance = balance + amount;
            System.out.println("After Deposit: " + balance);
        }
    }

    @Override
    public void withdraw(int amount) {
        balance = balance - amount;
        System.out.println("After Withdraw: " + balance);
    }

    public static void main(String[] args) {
        Bank b1 = new Customer();
        b1.deposit(100);
        b1.withdraw(100);
    }
}