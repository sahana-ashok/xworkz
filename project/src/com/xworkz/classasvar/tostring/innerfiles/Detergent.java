package com.xworkz.prog.tostring.innerfiles;

public class Detergent {
    private int capacity;
    private String brightness;
    private double flexibility;

    public Detergent(int capacity, String brightness, double flexibility) {
        this.capacity = capacity;
        this.brightness = brightness;
        this.flexibility = flexibility;
    }

    @Override
    public String toString() {
        return "Detergent [capacity=" + capacity + ", brightness=" + brightness + ", flexibility=" + flexibility + "]";
    }
    @Override
    public int hashCode(){
        return 4597;
    }
}
