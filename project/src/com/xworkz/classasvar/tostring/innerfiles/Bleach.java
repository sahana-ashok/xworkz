package com.xworkz.prog.tostring.innerfiles;

public class Bleach {
    private int color;
    private String flexibility;
    private double thickness;

    public Bleach(int color, String flexibility, double thickness) {
        this.color = color;
        this.flexibility = flexibility;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Bleach: color=" + color + ", flexibility=" + flexibility + ", thickness=" + thickness ;
    }
    @Override
    public int hashCode(){
        return 1870;
    }
}
