package com.practice.java.literal;

class p{
    String s = "Gopi";
}

class e extends p{
    String s = "Raju";
    public void m1(){
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);
    }
}
public class Constructor08 {
    public static void main(String[] args) {
        e e1 = new e();
        e1.m1();
    }
}
