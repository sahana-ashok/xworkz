package com.xworkz.prog.tostring.innerfiles;

public class Switch {
    private int color;
    private String volume;
    private double thickness;

    public Switch(int color, String volume, double thickness) {
        this.color = color;
        this.volume = volume;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Switch [color=" + color + ", volume=" + volume + ", thickness=" + thickness + "]";
    }
    @Override
    public int hashCode(){
        return 7567;
    }
}
