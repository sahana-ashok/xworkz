package com.xworkz.prog.inheritanceexamples.hybrid;

interface Protectable {
    void blockUV();
}

interface Waterproof {
    void resistWater();
}

class Sunscreen {
    void apply() {
        System.out.println("Sunscreen applied on skin");
    }
}

class WaterproofSunscreen extends Sunscreen implements Protectable, Waterproof {
    public void blockUV() {
        System.out.println("WaterproofSunscreen blocks UV rays");
    }

    public void resistWater() {
        System.out.println("WaterproofSunscreen resists water");
    }
}
