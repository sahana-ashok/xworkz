package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Animal {
    private String type;
    private int legs;

    public Animal(String type, int legs) {
        this.type = type;
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Animal [Type = " + type + ", Legs = " + legs + "]";
    }
}
