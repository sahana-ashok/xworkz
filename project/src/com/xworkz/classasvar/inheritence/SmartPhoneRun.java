package com.xworkz.prog.inheritence;

public class SmartPhoneRun {
    public static void main(String[] args) {
        Smartphone smartphone=new Smartphone();
        smartphone.brand();
        smartphone.model();
        smartphone.size();
        smartphone.storage();
        smartphone.os();
        System.out.println("------------");
        Smartphone smartphone1=new SmartphoneDetails();
        smartphone1.brand();
        smartphone1.model();
        smartphone1.size();
        smartphone1.storage();
        smartphone1.os();
    }
}
