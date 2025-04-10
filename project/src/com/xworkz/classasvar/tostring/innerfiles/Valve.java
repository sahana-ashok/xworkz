package com.xworkz.prog.tostring.innerfiles;

public class Valve {
    private int width;
    private String intensity;
    private double height;

    public Valve(int width, String intensity, double height) {
        this.width = width;
        this.intensity = intensity;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Valve [width=" + width + ", intensity=" + intensity + ", height=" + height + "]";
    }
    @Override
    public int hashCode(){
        return 79667;
    }
}
