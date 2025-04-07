package com.xworkz.prog.inheritance.internal.Marooncolor;

public class MaroonColor {
    public MaroonColor() {
        System.out.println("Running non-arg constructor MaroonColor--parent");
    }

    public void display() {
        System.out.println("MaroonColor is visible--parent");
    }

    public void mix() {
        System.out.println("MaroonColor can mix to form new shades--parent");
    }

    public void brighten() {
        System.out.println("MaroonColor can be made brighter--parent");
    }

    public void fade() {
        System.out.println("MaroonColor can fade over time--parent");
    }
}
