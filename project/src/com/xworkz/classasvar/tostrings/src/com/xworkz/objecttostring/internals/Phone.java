package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Phone {
    private String brand;
    private String model;
    private double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone [Brand=" + brand + ", Model=" + model + ", Price=" + price + "]";
    }

}
