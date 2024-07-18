package com.practice.java.interface_demo;

public interface Employee {

    default void m1() {
        System.out.println("Default method of Employee Interface");
    }

    public static void main(String[] args) {
        C c1 = new C();
        c1.m1();
    }
}
class B {
    public void m1(){
        System.out.println("Concrete method of B class");
    }
}
class C extends B implements Employee {

}
