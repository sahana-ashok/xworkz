package com.xworkz.prog.tostring.innerfiles;

public class Wheelchair {
    private int speed;
    private String size;
    private double width;

    public Wheelchair(int speed, String size, double width) {
        this.speed = speed;
        this.size = size;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Wheelchair [speed=" + speed + ", size=" + size + ", width=" + width + "]";
    }
    @Override
    public int hashCode(){
        return 867;
    }
}

