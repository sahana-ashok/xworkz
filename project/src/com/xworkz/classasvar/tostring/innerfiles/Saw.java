package com.xworkz.prog.tostring.innerfiles;

public class Saw {
    private int size;
    private String range;
    private double distance;

    public Saw(int size, String range, double distance) {
        this.size = size;
        this.range = range;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Saw [size=" + size + ", range=" + range + ", range=" + distance + "]";
    }

    @Override
    public int hashCode(){
        return 638;
    }
}
