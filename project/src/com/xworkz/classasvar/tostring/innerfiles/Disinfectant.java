package com.xworkz.prog.tostring.innerfiles;

public class Disinfectant {
    private int capacity;
    private String width;
    private double intensity;

    public Disinfectant(int capacity, String width, double intensity) {
        this.capacity = capacity;
        this.width = width;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "Disinfectant [capacity=" + capacity + ", width=" + width + ", intensity=" + intensity + "]";
    }
    @Override
    public int hashCode(){
        return 6897;
    }
}
