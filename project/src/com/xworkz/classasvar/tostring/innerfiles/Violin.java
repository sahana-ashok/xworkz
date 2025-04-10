package com.xworkz.prog.tostring.innerfiles;

public class Violin {
    private int density;
    private String intensity;
    private double shape;

    public Violin(int density, String intensity, double shape) {
        this.density = density;
        this.intensity = intensity;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Violin [density=" + density + ", intensity=" + intensity + ", shape=" + shape + "]";
    }
    @Override
    public int hashCode(){
        return 9567;
    }
}
