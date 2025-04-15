package com.xworkz.prog.inheritanceexamples.multi;

public class Lantern {
    void provideLight() {
        System.out.println("Lantern provides light");
    }
}

class LEDLantern extends Lantern {
    void saveEnergy() {
        System.out.println("LEDLantern saves energy");
    }
}

class SolarLantern extends LEDLantern {
    void chargeBySun() {
        System.out.println("SolarLantern charges using solar power");
    }
}
