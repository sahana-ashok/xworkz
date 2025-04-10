package com.xworkz.prog.tostring.innerfiles;

public class Wrench {
    private int intensity;
    private String brand;
    private double duration;

    public Wrench(int intensity, String brand, double duration) {
        this.intensity = intensity;
        this.brand = brand;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Wrench [intensity=" + intensity + ", intensity=" + brand + ", duration=" + duration + "]";
    }
    @Override
    public int hashCode(){
        return 87897;
    }
}
