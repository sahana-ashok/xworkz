package com.xworkz.prog.tostring.innerfiles;

public class Paper {
    private int size;
    private String shape;
    private double range;

    public Paper(int size, String shape, double range) {
        this.size = size;
        this.shape = shape;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Paper [size=" + size + ", shape=" + shape + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 2036;
    }
}
