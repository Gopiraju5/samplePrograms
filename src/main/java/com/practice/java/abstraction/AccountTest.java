package com.practice.java.abstraction;

abstract class Account {

    public void bankInfo() {
        System.out.println("Axis Bank");
        System.out.println("SBI Bank");
        System.out.println("HDFC Bank");
    }

    public abstract void deposit();

    public abstract void withdraw();
}

class SavingAccount extends Account {

    @Override
    public void deposit() {
        System.out.println("Per Day Deposit Is Rs: 1000");
    }

    @Override
    public void withdraw() {
        System.out.println("Per Day Withdraw Is Rs: 2000");
    }
}

class CurrentAccount extends Account {

    @Override
    public void deposit() {
        System.out.println("Per Day Deposit Is Rs: 10000");
    }

    @Override
    public void withdraw() {
        System.out.println("Per Day Withdraw Is Rs: 20000");
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Account act;
        act = new SavingAccount();
        act.bankInfo();
        act.deposit();
        act.withdraw();
        act = new CurrentAccount();
        act.bankInfo();
        act.deposit();
        act.withdraw();
    }
}
