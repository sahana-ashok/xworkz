package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Car {
    private String model;
    private String brand;
    private double price;

    public Car(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car: Model = " + model + ", Brand = " + brand + ", Price = " + price;
    }
}
