package com.xworkz.prog.tostring.innerfiles;

public class Scanner {
    private int brightness;
    private String power;
    private double thickness;

    public Scanner(int brightness, String power, double thickness) {
        this.brightness = brightness;
        this.power = power;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Scanner [brightness=" + brightness + ", power=" + power + ", thickness=" + thickness + "]";
    }
    @Override
    public int hashCode(){
        return 5990;
    }
}
