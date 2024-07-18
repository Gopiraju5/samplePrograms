package com.practice.java.oops;

//During the declaration

class Person {
    //variables are initialized at declaration time
    String name = "Gopi";
    int age = 20;
    public void talk(){
        System.out.println("My name is = " + name);
        System.out.println("My age is = " + age);
    }
}

public class Proj01Obj {
    public static void main(String[] args) {
        Person p = new Person();
        p.talk();

        Person sita = new Person();
        sita.talk();
    }
}
