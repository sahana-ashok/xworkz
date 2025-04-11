package com.xworkz.prog.tostring.equals;

public class TshirtRun {
    public static void main(String[] args) {
        Tshirt tshirt1 = new Tshirt();
        tshirt1.setBrand("xworkz");
        tshirt1.setSize("M");
        tshirt1.setColor("black");


        Tshirt tshirt2 = new Tshirt();
        tshirt2.setBrand("allen solly");
        tshirt2.setSize("S");
        tshirt2.setColor("black");


        System.out.println("checking location:"+(tshirt1==tshirt2));
        boolean same = tshirt2.equals(tshirt1);
        System.out.println("tshirt1 is same as tshirt2:"+same);



    }
}
