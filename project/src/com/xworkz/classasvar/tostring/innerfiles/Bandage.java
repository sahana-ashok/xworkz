package com.xworkz.prog.tostring.innerfiles;

public class Bandage {
    private int flexibility;
    private String shape;
    private double weight;

    public Bandage(int flexibility, String shape, double weight) {
        this.flexibility = flexibility;
        this.shape = shape;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bandage: flexibility=" + flexibility + ", shape=" + shape + ", weight=" + weight ;
    }
    @Override
    public int hashCode(){
        return 497;
    }
}
