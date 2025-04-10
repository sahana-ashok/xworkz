package com.xworkz.prog.tostring.innerfiles;

public class Spatula {
    private int shape;
    private String size;
    private double speed;

    public Spatula(int shape, String size, double speed) {
        this.shape = shape;
        this.size = size;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Spatula [shape=" + shape + ", size=" + size + ", speed=" + speed + "]";
    }
    @Override
    public int hashCode(){
        return 9875;
    }
}
