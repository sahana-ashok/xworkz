package com.xworkz.prog.casting;

public class EvCar {
    public EvCar() {
        super();
        System.out.println("Running non-arg constructor EvCar--child");
    }

    @Override
    public void transport() {
        System.out.println("EvCar is used for eco-friendly transportation--child");
    }

    @Override
    public void wheels() {
        System.out.println("EvCar has four wheels for smooth travel--child");
    }

    @Override
    public void engine() {
        System.out.println("EvCar runs on an electric motor powered by batteries--child");
    }

    @Override
    public void models() {
        System.out.println("EvCar comes in several futuristic models--child");
    }

    @Override
    public void comfort() {
        System.out.println("EvCar ensures high comfort with advanced features--child");
    }

    public void range() {
        System.out.println("EvCar has a long driving range on a single charge--extra method in child class");
    }
}
