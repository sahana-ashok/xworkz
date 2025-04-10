package com.xworkz.prog.tostring.innerfiles;

public class Tank {
    private int height;
    private String texture;
    private double speed;

    public Tank(int height, String texture, double speed) {
        this.height = height;
        this.texture = texture;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Tank [height=" + height + ", texture=" + texture + ", speed=" + speed + "]";
    }

    @Override
    public int hashCode(){
        return 7547;
    }
}
