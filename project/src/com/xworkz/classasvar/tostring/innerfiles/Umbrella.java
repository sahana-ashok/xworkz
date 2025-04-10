package com.xworkz.prog.tostring.innerfiles;

public class Umbrella {
    private int height;
    private String duration;
    private double size;

    public Umbrella(int height, String duration, double size) {
        this.height = height;
        this.duration = duration;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Umbrella [height=" + height + ", duration=" + duration + ", size=" + size + "]";
    }
    @Override
    public int hashCode(){
        return 9757;
    }
}
