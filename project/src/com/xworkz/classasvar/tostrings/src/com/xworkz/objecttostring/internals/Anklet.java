package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Anklet {
    private String material;
    private double length;
    private boolean hasBells;

    public Anklet(String material, double length, boolean hasBells) {
        this.material = material;
        this.length = length;
        this.hasBells = hasBells;
    }

    @Override
    public String toString() {
        return "Anklet [Material = " + material + ", Length = " + length + " cm, Has Bells = " + hasBells + "]";
    }

}
