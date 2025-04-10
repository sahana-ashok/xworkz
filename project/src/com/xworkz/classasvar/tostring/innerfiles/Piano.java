package com.xworkz.prog.tostring.innerfiles;

public class Piano {
    private int duration;
    private String capacity;
    private double texture;

    public Piano(int duration, String capacity, double texture) {
        this.duration = duration;
        this.capacity = capacity;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "Piano [duration=" + duration + ", capacity=" + capacity + ", texture=" + texture + "]";
    }
    @Override
    public int hashCode(){
        return 7801;
    }
}
