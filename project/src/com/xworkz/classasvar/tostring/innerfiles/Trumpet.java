package com.xworkz.prog.tostring.innerfiles;

public class Trumpet {
    private int flexibility;
    private String brightness;
    private double density;

    public Trumpet(int flexibility, String brightness, double density) {
        this.flexibility = flexibility;
        this.brightness = brightness;
        this.density = density;
    }

    @Override
    public String toString() {
        return "Trumpet [flexibility=" + flexibility + ", brightness=" + brightness + ", density=" + density + "]";
    }
    @Override
    public int hashCode(){
        return 9637;
    }
}
