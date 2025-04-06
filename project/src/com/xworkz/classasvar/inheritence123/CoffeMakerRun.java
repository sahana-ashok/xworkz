package com.xworkz.prog.inheritence123;

public class CoffeMakerRun {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker=new CoffeeMaker();
        coffeeMaker.brand();
        coffeeMaker.model();
        coffeeMaker.waterReservoirCapacity();
        coffeeMaker.strength();
        coffeeMaker.color();
        System.out.println("-------------");
        CoffeeMaker coffeeMaker1=new CoffeeMakerDetails();
        coffeeMaker1.brand();
        coffeeMaker1.model();
        coffeeMaker1.waterReservoirCapacity();
        coffeeMaker1.strength();
        coffeeMaker1.color();
    }
}
