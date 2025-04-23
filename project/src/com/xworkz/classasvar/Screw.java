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
public class Main {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        // Accessing all inherited methods
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy
    }
}
}