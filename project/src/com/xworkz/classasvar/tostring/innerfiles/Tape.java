package com.xworkz.prog.tostring.innerfiles;

public class Tape {
    private int range;
    private String power;
    private double shape;

    public Tape(int range, String power, double shape) {
        this.range = range;
        this.power = power;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Tape [range=" + range + ", power=" + power + ", shape=" + shape + "]";
    }

    @Override
    public int hashCode(){
        return 3687;
    }
}
