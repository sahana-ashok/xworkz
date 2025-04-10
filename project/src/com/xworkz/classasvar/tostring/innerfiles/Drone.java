package com.xworkz.prog.tostring.innerfiles;

public class Drone {
    private int power;
    private String texture;
    private double capacity;

    public Drone(int power, String texture, double capacity) {
        this.power = power;
        this.texture = texture;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Drone [power=" + power + ", texture=" + texture + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode(){
        return 800102;
    }
}
