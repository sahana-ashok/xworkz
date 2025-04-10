package com.xworkz.prog.tostring.innerfiles;

public class Pliers {
    private int speed;
    private String flexibility;
    private double power;

    public Pliers(int speed, String flexibility, double power) {
        this.speed = speed;
        this.flexibility = flexibility;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Pliers [speed=" + speed + ", flexibility=" + flexibility + ", power=" + power + "]";
    }
    @Override
    public int hashCode(){
        return 802;
    }
}
