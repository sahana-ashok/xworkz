package com.xworkz.prog.tostring.innerfiles;

public class MarkerPen {
    private int color;
    private String brightness;
    private double duration;

    public MarkerPen(int color, String brightness, double duration) {
        this.color = color;
        this.brightness = brightness;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "MarkerPen [color=" + color + ", brightness=" + brightness + ", duration=" + duration + "]";
    }
    @Override
    public int hashCode(){
        return 40;
    }
}
