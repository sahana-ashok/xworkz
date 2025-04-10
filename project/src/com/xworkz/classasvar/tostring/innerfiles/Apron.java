package com.xworkz.prog.tostring.innerfiles;

public class Apron {
    private int shape;
    private String texture;
    private double volume;

    public Apron(int shape, String texture, double volume) {
        this.shape = shape;
        this.texture = texture;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Apron : shape=" + shape + ", texture=" + texture + ", volume=" + volume ;
    }
    @Override
    public int hashCode(){
        return 270;
    }
}
