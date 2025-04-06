package com.xworkz.prog.inheritence123;

public class RefrigeratorRun {
    public static void main(String[] args) {
        Refrigerator refrigerator=new Refrigerator();
        refrigerator.color();
        refrigerator.capacity();
        refrigerator.energyStar();
        refrigerator.freezer();
        refrigerator.type();
        System.out.println("-------------");
        Refrigerator refrigerator1=new RefrigeratorDetails();
        refrigerator1.type();
        refrigerator1.freezer();
        refrigerator1.energyStar();
        refrigerator1.color();
        refrigerator1.capacity();
    }
}
