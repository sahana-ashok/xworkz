package com.xworkz.prog.tostring.innerfiles;

public class Easel {
    private int volume;
    private String color;
    private double size;

    public Easel(int volume, String color, double size) {
        this.volume = volume;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Easel [volume=" + volume + ", color=" + color + ", size=" + size + "]";
    }
    @Override
    public int hashCode(){
        return 90103;
    }
}
