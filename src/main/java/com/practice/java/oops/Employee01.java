package com.practice.java.oops;

public class Employee01 {

    int eno;
    String name;

    public void show(){
        System.out.println(eno);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Employee01 e1 = new Employee01();
        e1.show();
    }
}
