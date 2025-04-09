package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Barclet {
    private String material;
    private String color;
    private boolean isHandmade;

    public Barclet(String material, String color, boolean isHandmade) {
        this.material = material;
        this.color = color;
        this.isHandmade = isHandmade;
    }

    @Override
    public String toString() {
        return "Barclet [Material = " + material + ", Color = " + color + ", Handmade = " + isHandmade + "]";
    }

}


