package com.xworkz.prog.tostring.innerfiles;

public class Flute {
    private int brightness;
    private String height;
    private double width;

    public Flute(int brightness, String height, double width) {
        this.brightness = brightness;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Flute [brightness=" + brightness + ", height=" + height + ", width=" + width + "]";
    }
    @Override
    public int hashCode(){
        return 307;
    }
}
