package com.xworkz.prog.inheritanceexamples.hybrid;

interface Pointing {
    void pointNorth();
}

interface Measuring {
    void measureDirection();
}

class Compass {
    void rotate() {
        System.out.println("Compass is rotating");
    }
}

class MagneticCompass extends Compass implements Pointing, Measuring {
    public void pointNorth() {
        System.out.println("MagneticCompass pointing north");
    }

    public void measureDirection() {
        System.out.println("MagneticCompass measuring direction");
    }
}
