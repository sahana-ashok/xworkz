package com.xworkz.prog.inheritence;

public class ShapeRun {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.circle();
        shape.square();
        shape.rectangle();
        shape.triangle();
        shape.cylinder();
        System.out.println("--------------");
        Shape shape1=new ShapeDetails();
        shape1.circle();
        shape1.square();
        shape1.rectangle();
        shape1.triangle();
        shape1.cylinder();
    }
}
