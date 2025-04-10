package com.xworkz.prog.tostring.innerfiles;

public class RollingPin {
    private int size;
    private String speed;
    private double power;

    public RollingPin(int size, String speed, double power) {
        this.size = size;
        this.speed = speed;
        this.power = power;
    }

    @Override
    public String toString() {
        return "RollingPin [size=" + size + ", speed=" + speed + ", power=" + power + "]";
    }

    @Override
    public int hashCode(){
        return 459;
    }
}
