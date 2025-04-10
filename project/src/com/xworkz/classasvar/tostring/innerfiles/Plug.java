package com.xworkz.prog.tostring.innerfiles;

public class Plug {
    private int brightness;
    private String density;
    private double flexibility;

    public Plug(int brightness, String density, double flexibility) {
        this.brightness = brightness;
        this.density = density;
        this.flexibility = flexibility;
    }

    @Override
    public String toString() {
        return "Plug [brightness=" + brightness + ", density=" + density + ", flexibility=" + flexibility + "]";
    }
    @Override
    public int hashCode(){
        return 9023;
    }
}
