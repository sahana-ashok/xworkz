package com.xworkz.prog.tostring.innerfiles;

public class Printer {
    private int width;
    private String material;
    private double weight;

    public Printer(int width, String material, double weight) {
        this.width = width;
        this.material = material;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Printer [width=" + width + ", material=" + material + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 20036;
    }
}
