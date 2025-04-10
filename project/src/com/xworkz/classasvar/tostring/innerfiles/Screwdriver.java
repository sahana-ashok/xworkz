package com.xworkz.prog.tostring.innerfiles;

public class Screwdriver {
    private int size;
    private String weight;
    private double capacity;

    public Screwdriver(int size, String weight, double capacity) {
        this.size = size;
        this.weight = weight;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Screwdriver [size=" + size + ", weight=" + weight + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode(){
        return 69820;
    }
}
