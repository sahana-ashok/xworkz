package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Fruit {
    private int total;
    private String color;
    private double quantity;

    public Fruit(int total, String color, double quantity) {
        this.total = total;
        this.color = color;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fruit properties are: Total number is= " + total + ", Color is= " + color + ", Quantity is = " + quantity ;
    }

}
