package com.xworkz.prog.tostring.innerfiles;

public class Scalpel {
    private int weight;
    private String color;
    private double speed;

    public Scalpel(int weight, String color, double speed) {
        this.weight = weight;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Scalpel [weight=" + weight + ", weight=" + color + ", speed=" + speed + "]";
    }
    @Override
    public int hashCode(){
        return 98751;
    }
}
