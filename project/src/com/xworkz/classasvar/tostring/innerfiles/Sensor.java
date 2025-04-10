package com.xworkz.prog.tostring.innerfiles;

public class Sensor {
    private int power;
    private String weight;
    private double color;

    public Sensor(int power, String weight, double color) {
        this.power = power;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sensor [power=" + power + ", weight=" + weight + ", color=" + color + "]";
    }

    @Override
    public int hashCode(){
        return 90165;
    }
}
