package com.xworkz.prog.inheritance.internal.steelbottle;

public class SteelBottle {
    public SteelBottle() {
        System.out.println("Running non-arg constructor Bottle--parent");
    }
    public void fill() {
        System.out.println("SteelBottle is filled with liquid--parent");
    }
    public void storeWater() {
        System.out.println("SteelBottle stores water--parent");
    }
    public void storeMilk() {
        System.out.println("SteelBottle stores milk--parent");
    }
    public void madeOfGlass() {
        System.out.println("Some SteelBottle are made of glass--parent");
    }
    public void frozen() {
        System.out.println("SteelBottle can be frozen--parent");
    }
}
