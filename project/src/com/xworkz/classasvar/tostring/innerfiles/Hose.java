package com.xworkz.prog.tostring.innerfiles;

public class Hose {
    private int power;
    private String capacity;
    private double range;

    public Hose(int power, String capacity, double range) {
        this.power = power;
        this.capacity = capacity;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Hose [power=" + power + ", capacity=" + capacity + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 301;
    }
}
