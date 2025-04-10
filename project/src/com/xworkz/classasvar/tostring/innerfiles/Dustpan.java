package com.xworkz.prog.tostring.innerfiles;

public class Dustpan {
    private int volume;
    private String density;
    private double size;

    public Dustpan(int volume, String density, double size) {
        this.volume = volume;
        this.density = density;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dustpan [volume=" + volume + ", density=" + density + ", size=" + size + "]";
    }
    @Override
    public int hashCode(){
        return 75903;
    }
}
