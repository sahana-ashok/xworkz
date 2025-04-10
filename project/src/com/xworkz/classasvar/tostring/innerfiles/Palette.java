package com.xworkz.prog.tostring.innerfiles;

public class Palette {
    private int speed;
    private String width;
    private double volume;

    public Palette(int speed, String width, double volume) {
        this.speed = speed;
        this.width = width;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Palette [speed=" + speed + ", width=" + width + ", volume=" + volume + "]";
    }
    @Override
    public int hashCode(){
        return 410;
    }
}
