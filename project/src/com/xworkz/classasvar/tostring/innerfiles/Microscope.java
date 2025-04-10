package com.xworkz.prog.tostring.innerfiles;

public class Microscope {
    private int range;
    private String width;
    private double density;

    public Microscope(int range, String width, double density) {
        this.range = range;
        this.width = width;
        this.density = density;
    }

    @Override
    public String toString() {
        return "Microscope [range=" + range + ", width=" + width + ", density=" + density + "]";
    }
    @Override
    public int hashCode(){
        return 900;
    }
}
