package com.xworkz.prog.tostring.innerfiles;

public class Fuse {
    private int thickness;
    private String color;
    private double brightness;

    public Fuse(int thickness, String color, double brightness) {
        this.thickness = thickness;
        this.color = color;
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Fuse [thickness=" + thickness + ", color=" + color + ", brightness=" + brightness + "]";
    }
    @Override
    public int hashCode(){
        return 267;
    }
}
