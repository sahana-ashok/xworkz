package com.xworkz.prog.tostring.innerfiles;

public class Tablet {
    private int price;
    private String color;
    private double weight;

    public Tablet(int price, String color, double weight) {
        this.price = price;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Tablet [color=" + price + ", color=" + color + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 895667;
    }
}
