package com.xworkz.prog.tostring.innerfiles;

public class Guitar {
    private int height;
    private String density;
    private double brightness;

    public Guitar(int height, String density, double brightness) {
        this.height = height;
        this.density = density;
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Guitar [height=" + height + ", density=" + density + ", brightness=" + brightness + "]";
    }
    @Override
    public int hashCode(){
        return 7398;
    }
}
