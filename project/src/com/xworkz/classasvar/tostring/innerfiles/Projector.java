package com.xworkz.prog.tostring.innerfiles;

public class Projector {
    private int thickness;
    private String density;
    private double range;

    public Projector(int thickness, String density, double range) {
        this.thickness = thickness;
        this.density = density;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Projector [thickness=" + thickness + ", density=" + density + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 102;
    }
}
