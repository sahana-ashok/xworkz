package com.xworkz.prog;

public class Screw {
    String type;
    int length;

    Screw(String type, int length) {
        this.type = type;
        this.length = length;
    }

    void showScrewDetails() {
        System.out.println("Screw Type: " + type + ", Length: " + length + "mm");
    }
}
