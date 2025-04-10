package com.xworkz.prog.tostring.innerfiles;

public class Barrel {
    private int weight;
    private String power;
    private double capacity;

    public Barrel(int weight, String power, double capacity) {
        this.weight = weight;
        this.power = power;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Barrel: weight=" + weight + ", power=" + power + ", capacity=" + capacity ;
    }
    @Override
    public int hashCode(){
        return 790;
    }
}
