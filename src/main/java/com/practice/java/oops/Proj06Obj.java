package com.practice.java.oops;


class Bar {
    String barName;
    int shopNumber;
    int shopCustomers;
    float points;

    public void assign(String barName, int shopNumber, int shopCustomers, float points) {
        this.barName = barName;
        this.shopNumber = shopNumber;
        this.shopCustomers = shopCustomers;
        this.points = points;
    }

    public void talk() {
        System.out.println("My barName is = " + barName);
        System.out.println("My shopNumber is = " + shopNumber);
        System.out.println("My shopCustomers is = " + shopCustomers);
        System.out.println("My points is = " + points);
    }
}

public class Proj06Obj {
    public static void main(String[] args) {
        Bar b = new Bar();
        b.assign("Good", 12, 4, 50.2f);
        b.talk();
    }
}
