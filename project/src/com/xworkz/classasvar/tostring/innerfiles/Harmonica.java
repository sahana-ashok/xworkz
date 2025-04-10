package com.xworkz.prog.tostring.innerfiles;

public class Harmonica {
    private int texture;
    private String capacity;
    private double thickness;

    public Harmonica(int texture, String capacity, double thickness) {
        this.texture = texture;
        this.capacity = capacity;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Harmonica [texture=" + texture + ", capacity=" + capacity + ", thickness=" + thickness + "]";
    }
    @Override
    public int hashCode(){
        return 60;
    }
}
