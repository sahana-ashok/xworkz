package com.xworkz.prog.tostring.innerfiles;

public class Highlighter {
    private int width;
    private String color;
    private double intensity;

    public Highlighter(int width, String color, double intensity) {
        this.width = width;
        this.color = color;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "Highlighter [width=" + width + ", color=" + color + ", intensity=" + intensity + "]";
    }
    @Override
    public int hashCode(){
        return 3026;
    }
}
