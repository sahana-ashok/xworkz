package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Vegetable {
    private int total;
    private String color;
    private double quantity;

    public Vegetable(int total, String color, double quantity) {
        this.total = total;
        this.color = color;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Vegetable properties are: Total number is= " + total + ", Color is= " + color + ", Quantity is = " + quantity;
    }
}
