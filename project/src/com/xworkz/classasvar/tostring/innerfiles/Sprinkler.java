package com.xworkz.prog.tostring.innerfiles;

public class Sprinkler {
    private int shape;
    private String color;
    private double intensity;

    public Sprinkler(int shape, String color, double intensity) {
        this.shape = shape;
        this.color = color;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "Sprinkler [shape=" + shape + ", shape=" + color + ", intensity=" + intensity + "]";
    }
    @Override
    public int hashCode(){
        return 15202;
    }
}
