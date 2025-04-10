package com.xworkz.prog.tostring.innerfiles;

public class Folder {
    private int height;
    private String volume;
    private double weight;

    public Folder(int height, String volume, double weight) {
        this.height = height;
        this.volume = volume;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Folder [height=" + height + ", volume=" + volume + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 3021;
    }
}
