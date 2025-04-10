package com.xworkz.prog.tostring.innerfiles;

public class Flashlight {
    private int weight;
    private String intensity;
    private double density;

    public Flashlight(int weight, String intensity, double density) {
        this.weight = weight;
        this.intensity = intensity;
        this.density = density;
    }

    @Override
    public String toString() {
        return "Flashlight [weight=" + weight + ", intensity=" + intensity + ", density=" + density + "]";
    }
    @Override
    public int hashCode(){
        return 107;
    }
}
