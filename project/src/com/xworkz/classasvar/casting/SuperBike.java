package com.xworkz.prog.casting;

public class SuperBike {
    public SuperBike() {
        super();
        System.out.println("Running no-arg constructor SuperBike");
    }

    @Override
    public void transport() {
        System.out.println("SuperBike is used for high-speed transport--child");
    }

    @Override
    public void wheels() {
        System.out.println("SuperBike has performance wheels--child");
    }

    @Override
    public void fuel() {
        System.out.println("SuperBike uses premium fuel--child");
    }

    @Override
    public void safety() {
        System.out.println("SuperBike includes advanced safety features--child");
    }

    @Override
    public void model() {
        System.out.println("SuperBike comes in luxury models--child");
    }

    public void race() {
        System.out.println("New method race in child class");
    }

}
