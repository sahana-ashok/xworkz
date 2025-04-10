package com.xworkz.prog.tostring.innerfiles;

public class Envelope {
    private int speed;
    private String intensity;
    private double thickness;

    public Envelope(int speed, String intensity, double thickness) {
        this.speed = speed;
        this.intensity = intensity;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Envelope [speed=" + speed + ", intensity=" + intensity + ", thickness=" + thickness + "]";
    }
    @Override
    public int hashCode(){
        return 801023;
    }
}
