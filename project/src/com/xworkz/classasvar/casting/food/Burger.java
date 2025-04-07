package com.xworkz.prog.casting.food;

public class Burger extends Food {
    public Burger() {
        super();
        System.out.println("Burger -- child");
    }

    @Override
    public void eat() {
        System.out.println("Eating -- child");
    }

    @Override
    public void taste() {
        System.out.println("Has taste -- child");
    }

    @Override
    public void cook() {
        System.out.println("Cooking -- child");
    }

    @Override
    public void health() {
        System.out.println("Healthy -- child");
    }

    @Override
    public void spice() {
        System.out.println("Spicy -- child");
    }

    public void full(){
        System.out.println("new method full in child class");
    }
}
