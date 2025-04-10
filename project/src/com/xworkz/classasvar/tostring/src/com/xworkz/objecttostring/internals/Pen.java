package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Pen {
    private String brand;
    private String color;
    private double price;

    public Pen(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen [Brand = " + brand + ", Color = " + color + ", Price = " + price + "]";
    }
}
