package com.xworkz.prog.tostring.innerfiles;

public class Chalk {
    private int power;
    private String size;
    private double density;

    public Chalk(int power, String size, double density) {
        this.power = power;
        this.size = size;
        this.density = density;
    }

    @Override
    public String toString() {
        return "Chalk [power=" + power + ", size=" + size + ", power=" + density + "]";
    }
    @Override
    public int hashCode(){
        return 897;
    }
}
