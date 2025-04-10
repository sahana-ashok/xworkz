package com.xworkz.prog.tostring.innerfiles;

public class Strainer {
    private int thickness;
    private String material;
    private double capacity;

    public Strainer(int thickness, String material, double capacity) {
        this.thickness = thickness;
        this.material = material;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Strainer [thickness=" + thickness + ", material=" + material + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode(){
        return 60507;
    }
}
