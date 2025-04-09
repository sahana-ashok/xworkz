package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Television {
    private String brand;
    private int screenSize;
    private boolean isSmart;

    public Television(String brand, int screenSize, boolean isSmart) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "Television [Brand = " + brand + ", Screen Size = " + screenSize + " inches, Smart TV = " + isSmart + "]";
    }

}
