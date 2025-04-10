package com.xworkz.prog.tostring.innerfiles;

public class ExtensionCord {
    private int height;
    private String thickness;
    private double density;

    public ExtensionCord(int height, String thickness, double density) {
        this.height = height;
        this.thickness = thickness;
        this.density = density;
    }

    @Override
    public String toString() {
        return "ExtensionCord [height=" + height + ", thickness=" + thickness + ", density=" + density + "]";
    }
    @Override
    public int hashCode(){
        return 90020;
    }
}
