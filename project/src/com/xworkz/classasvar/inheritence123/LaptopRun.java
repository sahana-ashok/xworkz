package com.xworkz.prog.inheritence123;

public class LaptopRun {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.brand();
        laptop.model();
        laptop.processor();
        laptop.ram();
        laptop.storage();
        System.out.println("-------------");
        Laptop laptop1=new LaptopDetails();
        laptop1.brand();
        laptop1.model();
        laptop1.processor();
        laptop1.ram();
        laptop1.storage();
    }
}
