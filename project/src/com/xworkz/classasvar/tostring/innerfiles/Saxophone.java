package com.xworkz.prog.tostring.innerfiles;

public class Saxophone {
    private int color;
    private String brand;
    private double shape;

    public Saxophone(int color, String brand, double shape) {
        this.color = color;
        this.brand = brand;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Saxophone [color=" + color + ", color=" + brand + ", shape=" + shape + "]";
    }

    @Override
    public int hashCode(){
        return 67890;
    }
}
