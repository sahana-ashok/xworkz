package com.xworkz.prog.tostring.innerfiles;

public class Mop {
    private int brightness;
    private String thickness;
    private double volume;

    public Mop(int brightness, String thickness, double volume) {
        this.brightness = brightness;
        this.thickness = thickness;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Mop [brightness=" + brightness + ", thickness=" + thickness + ", volume=" + volume + "]";
    }
    @Override
    public int hashCode(){
        return 01;
    }
}
