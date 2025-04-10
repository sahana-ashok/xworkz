package com.xworkz.prog.tostring.innerfiles;

public class Stethoscope {
    private int color;
    private String flexibility;
    private double shape;

    public Stethoscope(int color, String flexibility, double shape) {
        this.color = color;
        this.flexibility = flexibility;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Stethoscope [color=" + color + ", flexibility=" + flexibility + ", shape=" + shape + "]";
    }
    @Override
    public int hashCode(){
        return 90030;
    }
}
