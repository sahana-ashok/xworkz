package com.xworkz.prog.casting;

public class DishWasher extends Devices {
    public DishWasher() {
        super();
        System.out.println("Running non-arg constructor DishWasher");
    }

    @Override
    public void powerOn() {
        System.out.println("DishWasher is powered on--child");
    }

    @Override
    public void powerOff() {
        System.out.println("DishWasher is powered off--child");
    }

    @Override
    public void consumeElectricity() {
        System.out.println("DishWasher consumes electricity--child");
    }

    @Override
    public void function() {
        System.out.println("DishWasher cleans dishes--child");
    }

    @Override
    public void brand() {
        System.out.println("DishWasher has a specific brand--child");
    }

    public void capacity() {
        System.out.println("New method capacity in child class");
    }
}

