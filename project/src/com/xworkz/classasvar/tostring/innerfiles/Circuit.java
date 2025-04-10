package com.xworkz.prog.tostring.innerfiles;

public class Circuit {
    private int thickness;
    private String width;
    private double capacity;

    public Circuit(int thickness, String width, double capacity) {
        this.thickness = thickness;
        this.width = width;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Circuit [thickness=" + thickness + ", width=" + width + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode(){
        return 12397;
    }
}
