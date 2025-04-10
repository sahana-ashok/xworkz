package com.xworkz.prog.tostring.innerfiles;

public class Tongs {
    private int weight;
    private String flexibility;
    private double power;

    public Tongs(int weight, String flexibility, double power) {
        this.weight = weight;
        this.flexibility = flexibility;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Tongs [weight=" + weight + ", flexibility=" + flexibility + ", power=" + power + "]";
    }
    @Override
    public int hashCode(){
        return 9999;
    }
}
