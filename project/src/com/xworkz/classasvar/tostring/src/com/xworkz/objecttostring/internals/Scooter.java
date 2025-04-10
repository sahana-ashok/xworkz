package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Scooter {
    private String model;
    private int engineCC;
    private String color;

    public Scooter(String model, int engineCC, String color) {
        this.model = model;
        this.engineCC = engineCC;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Scooter [Model = " + model + ", Engine CC = " + engineCC + ", Color = " + color + "]";
    }
}
