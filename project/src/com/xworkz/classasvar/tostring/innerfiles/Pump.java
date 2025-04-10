package com.xworkz.prog.tostring.innerfiles;

public class Pump {
    private int texture;
    private String height;
    private double capacity;

    public Pump(int texture, String height, double capacity) {
        this.texture = texture;
        this.height = height;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Pump [texture=" + texture + ", height=" + height + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode(){
        return 89902;
    }
}
