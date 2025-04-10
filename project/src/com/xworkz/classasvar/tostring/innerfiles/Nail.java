package com.xworkz.prog.tostring.innerfiles;

public class Nail {
    private int width;
    private String intensity;
    private double power;

    public Nail(int width, String intensity, double power) {
        this.width = width;
        this.intensity = intensity;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Nail [width=" + width + ", intensity=" + intensity + ", power=" + power + "]";
    }
    @Override
    public int hashCode(){
        return 52;
    }
}
