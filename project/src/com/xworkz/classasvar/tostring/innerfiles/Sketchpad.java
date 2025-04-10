package com.xworkz.prog.tostring.innerfiles;

public class Sketchpad {
    private int material;
    private String size;
    private double weight;

    public Sketchpad(int material, String size, double weight) {
        this.material = material;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sketchpad [material=" + material + ", size=" + size + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 3698745;
    }
}
