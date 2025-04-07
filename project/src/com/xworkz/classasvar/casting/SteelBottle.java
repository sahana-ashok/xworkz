package com.xworkz.prog.casting;

public class SteelBottle extends Bottle{
    public SteelBottle() {
        super();
        System.out.println("Running no-arg constructor SteelBottle -- Child Class");
    }

    @Override
    public void fill() {
        System.out.println("SteelBottle is filled with liquid -- Child Class");
    }

    @Override
    public void storeWater() {
        System.out.println("SteelBottle stores water efficiently -- Child Class");
    }

    @Override
    public void storeMilk() {
        System.out.println("SteelBottle stores milk safely -- Child Class");
    }

    @Override
    public void madeOfGlass() {
        System.out.println("SteelBottle is made of stainless steel -- Child Class");
    }

    @Override
    public void frozen() {
        System.out.println("SteelBottle can be kept in freezer -- Child Class");
    }

    public void insulate() {
        System.out.println("New method insulate() in child class SteelBottle");
    }
}

}
