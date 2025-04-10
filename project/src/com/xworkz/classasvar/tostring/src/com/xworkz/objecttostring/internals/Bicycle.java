package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Bicycle {
    private String model;
    private int gears;
    private boolean hasBasket;

    public Bicycle(String model, int gears, boolean hasBasket) {
        this.model = model;
        this.gears = gears;
        this.hasBasket = hasBasket;
    }

    @Override
    public String toString() {
        return "Bicycle [Model = " + model + ", Gears = " + gears + ", Has Basket = " + hasBasket + "]";
    }
}
