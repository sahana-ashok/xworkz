package com.xworkz.prog.tostring.innerfiles;

public class Bolt {
    private int height;
    private String texture;
    private double speed;

    public Bolt(int height, String texture, double speed) {
        this.height = height;
        this.texture = texture;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Bolt: height=" + height + ", texture=" + texture + ", speed=" + speed;
    }
    @Override
    public int hashCode(){
        return 450;
    }
}
