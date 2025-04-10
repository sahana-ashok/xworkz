package com.xworkz.prog.tostring.innerfiles;

public class Sunglasses {
    private int capacity;
    private String brightness;
    private double density;

    public Sunglasses(int capacity, String brightness, double density) {
        this.capacity = capacity;
        this.brightness = brightness;
        this.density = density;
    }

    @Override
    public String toString() {
        return "Sunglasses [capacity=" + capacity + ", brightness=" + brightness + ", density=" + density + "]";
    }
    @Override
    public int hashCode(){
        return 8907;
    }
}
