package com.xworkz.prog.tostring.innerfiles;

public class Receiver {
    private int power;
    private String height;
    private double weight;

    public Receiver(int power, String height, double weight) {
        this.power = power;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Receiver [power=" + power + ", height=" + height + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 3021;
    }
}
