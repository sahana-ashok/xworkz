package com.xworkz.prog.tostring.innerfiles;

public class Robot {
    private int width;
    private String flexibility;
    private double range;

    public Robot(int width, String flexibility, double range) {
        this.width = width;
        this.flexibility = flexibility;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Robot [width=" + width + ", flexibility=" + flexibility + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 450;
    }
}
