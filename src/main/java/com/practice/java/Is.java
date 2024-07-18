package com.practice.java;

class Parent {
    public void m1() {
        System.out.println("This Method is Parent");
    }
}

class Child extends Parent {
    public void m2() {
        System.out.println("This Method is Child");
    }
}

public class Is {
    public static void main(String[] args) {

/*        Parent par = new Parent();
        par.m1();
//        par.m2();


        Child ch = new Child();
        ch.m2();
        ch.m1();*/

        Parent pa = new Child();
        pa.m1();
//        pa.m2();

//        Child c = new Parent();
    }
}
