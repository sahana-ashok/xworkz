package com.xworkz.prog.tostring.innerfiles;

public class Cooler {
    private int material;
    private String weight;
    private double power;

    public Cooler(int material, String weight, double power) {
        this.material = material;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Cooler [material=" + material + ", weight=" + weight + ", power=" + power + "]";
    }
    @Override
    public int hashCode(){
        return 45897;
    }
}
