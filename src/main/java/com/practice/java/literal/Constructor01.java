package com.practice.java.literal;

public class Constructor01 {
    int rollNum;
    String name;
    String collageName;

    /*    Constructor01(int rollNum, String name, String collageName){
            this.rollNum = rollNum;
            this.name = name;
            this.collageName = collageName;
        }*/
    Constructor01() {
        this.rollNum = rollNum;
        this.name = name;
        this.collageName = collageName;
    }

    public static void main(String[] args) {
/*        Constructor01 con1 = new Constructor01(101, "Gopi", "Avcd");
        Constructor01 con2 = new Constructor01(102, "Raju", "NHj");
        System.out.println(con1.rollNum+" "+con1.name+" "+con1.collageName);
        System.out.println(con2.rollNum+" "+con2.name+" "+con2.collageName);*/

        Constructor01 con1 = new Constructor01();
        con1.rollNum = 101;
        System.out.println(con1.rollNum);
    }
}
