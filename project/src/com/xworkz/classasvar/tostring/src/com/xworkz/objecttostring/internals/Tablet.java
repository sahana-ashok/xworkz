package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Tablet {
    private String brand;
    private double screenSize;
    private boolean supportsStylus;

    public Tablet(String brand, double screenSize, boolean supportsStylus) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.supportsStylus = supportsStylus;
    }

    @Override
    public String toString() {
        return "Tablet [Brand = " + brand + ", Screen Size = " + screenSize + " inches, Stylus Support = " + supportsStylus + "]";
    }
}
