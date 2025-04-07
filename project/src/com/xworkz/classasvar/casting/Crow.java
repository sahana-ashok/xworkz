package com.xworkz.prog.casting;

public class Crow extends Bird{
    public Crow() {
        super();
        System.out.println("Running no-arg constructor Crow");
    }

    @Override
    public void fly() {
        System.out.println("Crow flies at medium height--child");
    }

    @Override
    public void feathers() {
        System.out.println("Crow has black feathers--child");
    }

    @Override
    public void layEggs() {
        System.out.println("Crow lays 3-5 eggs--child");
    }

    @Override
    public void sound() {
        System.out.println("Crow makes cawing sound--child");
    }

    @Override
    public void vision() {
        System.out.println("Crow has decent vision--child");
    }

    public void searchFood() {
        System.out.println("New method searchFood in child class");
    }
}
