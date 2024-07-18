package com.practice.java.oops;

public class Pen {
    String name;
    String type;
    double price;
    String color;

    public String getPenInformation(){
        return "Pen name is: "+name+"It is a: "+type+"It's price is: "+price+"and Pen colour is: "+color;
    }

    public void write(){
        System.out.println("I am a" +type+ "type pen and I am used to write");
    }

    public static void main(String[] args) {
        Pen p = new Pen();
        p.name = "Saino";
        p.type = "ball";
        p.price = 3.00;
        p.color = "White";
        p.write();
        String information = p.getPenInformation();
        System.out.println(information);
    }
}
