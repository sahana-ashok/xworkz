package com.xworkz.prog.tostring.innerfiles;

public class MeasuringCup {
    private int intensity;
    private String duration;
    private double speed;

    public MeasuringCup(int intensity, String duration, double speed) {
        this.intensity = intensity;
        this.duration = duration;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "MeasuringCup [intensity=" + intensity + ", duration=" + duration + ", speed=" + speed + "]";
    }
    @Override
    public int hashCode(){
        return 960;
    }
}
