package com.xworkz.prog.casting;

public class House extends Apartment{
    public House() {
        super();
        System.out.println("Running no-arg constructor House");
    }

    @Override
    public void shelter() {
        System.out.println("House provides comfortable shelter--child");
    }

    @Override
    public void structure() {
        System.out.println("House structure is designed for living--child");
    }

    @Override
    public void floors() {
        System.out.println("House can have one or more floors--child");
    }

    @Override
    public void foundation() {
        System.out.println("House foundation is strong and durable--child");
    }

    @Override
    public void rooms() {
        System.out.println("House has bedrooms, kitchen, and living areas--child");
    }

    public void door() {
        System.out.println("New method door in child class");
    }
}
