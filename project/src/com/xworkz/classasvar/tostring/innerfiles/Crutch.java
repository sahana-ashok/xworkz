package com.xworkz.prog.tostring.innerfiles;

public class Crutch {
    private int weight;
    private String density;
    private double material;

    public Crutch(int weight, String density, double material) {
        this.weight = weight;
        this.density = density;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Crutch [weight=" + weight + ", density=" + density + ", material=" + material + "]";
    }
    @Override
    public int hashCode(){
        return 35897;
    }
}
