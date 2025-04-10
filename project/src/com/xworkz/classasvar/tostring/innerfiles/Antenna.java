package com.xworkz.prog.tostring.innerfiles;

public class Antenna {
    private int size;
    private String flexibility;
    private double shape;

    public Antenna(int size, String flexibility, double shape) {
        this.size = size;
        this.flexibility = flexibility;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Antenna : size=" + size + ", flexibility=" + flexibility + ", shape=" + shape ;
    }
    @Override
    public int hashCode(){
        return 97;
    }
}
