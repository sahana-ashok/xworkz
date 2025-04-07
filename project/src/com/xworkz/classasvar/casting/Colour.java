package com.xworkz.prog.casting;

public class Colour {
    public Colour() {
        System.out.println("Running non-arg constructor Colour--parent");
    }

    public void display() {
        System.out.println("Colour is visible--parent");
    }

    public void mix() {
        System.out.println("Colours can mix to form new shades--parent");
    }

    public void brighten() {
        System.out.println("Colour can be made brighter--parent");
    }

    public void fade() {
        System.out.println("Colour can fade over time--parent");
    }
}
