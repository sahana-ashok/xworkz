package com.xworkz.prog.tostring.innerfiles;

public class Ladder {
    private int color;
    private String flexibility;
    private double shape;

    public Ladder(int color, String flexibility, double shape) {
        this.color = color;
        this.flexibility = flexibility;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Ladder [color=" + color + ", flexibility=" + flexibility + ", shape=" + shape + "]";
    }
    @Override
    public int hashCode(){
        return 30;
    }
}
