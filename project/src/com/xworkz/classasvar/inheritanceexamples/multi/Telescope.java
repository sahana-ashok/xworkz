package com.xworkz.prog.inheritanceexamples.multi;

public class Telescope {
    void viewStars() {
        System.out.println("Telescope views celestial bodies");
    }
}

class RefractingTelescope extends Telescope {
    void useLenses() {
        System.out.println("RefractingTelescope uses convex lenses");
    }
}

class SpaceTelescope extends RefractingTelescope {
    void orbitEarth() {
        System.out.println("SpaceTelescope orbits the Earth");
    }

}
