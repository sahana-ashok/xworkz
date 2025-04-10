package com.xworkz.prog.tostring.innerfiles;

public class Syringe {
    private int shape;
    private String width;
    private double range;

    public Syringe(int shape, String width, double range) {
        this.shape = shape;
        this.width = width;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Syringe [shape=" + shape + ", width=" + width + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 6567;
    }
}
