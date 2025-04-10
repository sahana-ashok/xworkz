package com.xworkz.prog.tostring.innerfiles;

public class Router {
    private int intensity;
    private String power;
    private double duration;

    public Router(int intensity, String power, double duration) {
        this.intensity = intensity;
        this.power = power;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Router [intensity=" + intensity + ", power=" + power + ", duration=" + duration + "]";
    }
    @Override
    public int hashCode(){
        return 8933;
    }
}
