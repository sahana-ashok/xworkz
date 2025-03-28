package com.xworkz.prog.inheritence;

public class GuitarRun {
    public static void main(String[] args) {
        Guitar guitar=new Guitar();
        guitar.brand();
        guitar.color();
        guitar.material();
        guitar.strings();
        guitar.type();
        System.out.println("---------------");
        Guitar guitar1=new GuitarDetails();
        guitar1.type();
        guitar1.strings();
        guitar1.color();
        guitar1.brand();
        guitar1.material();
    }
}
