package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Helmet {
    private String brand;
    private String size;
    private boolean isISICertified;

    public Helmet(String brand, String size, boolean isISICertified) {
        this.brand = brand;
        this.size = size;
        this.isISICertified = isISICertified;
    }

    @Override
    public String toString() {
        return "Helmet [Brand = " + brand + ", Size = " + size + ", ISI Certified = " + isISICertified + "]";
    }
}
