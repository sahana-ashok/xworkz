package com.xworkz.prog.tostring.innerfiles;

public class Vacuum {
    private int width;
    private String duration;
    private double capacity;

    public Vacuum(int width, String duration, double capacity) {
        this.width = width;
        this.duration = duration;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Vacuum [width=" + width + ", duration=" + duration + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode(){
        return 8967;
    }
}
