package com.xworkz.prog.tostring.innerfiles;

public class Cello {
    private int texture;
    private String speed;
    private double thickness;

    public Cello(int texture, String speed, double thickness) {
        this.texture = texture;
        this.speed = speed;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Cello [texture=" + texture + ", speed=" + speed + ", thickness=" + thickness + "]";
    }
    @Override
    public int hashCode(){
        return 4897;
    }
}
