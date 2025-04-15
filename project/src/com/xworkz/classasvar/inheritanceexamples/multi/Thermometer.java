package com.xworkz.prog.inheritanceexamples.multi;

public class Thermometer {
    void measureTemp() {
        System.out.println("Thermometer measures temperature");
    }
}

class MercuryThermometer extends Thermometer {
    void useMercury() {
        System.out.println("MercuryThermometer uses mercury");
    }
}

class InfraredThermometer extends MercuryThermometer {
    void useInfrared() {
        System.out.println("InfraredThermometer uses infrared technology");
    }
}
