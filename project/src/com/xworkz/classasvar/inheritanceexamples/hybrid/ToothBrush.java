package com.xworkz.prog.inheritanceexamples.hybrid;

interface Cleanable {
    void cleanTeeth();
}

interface Rechargeable {
    void charge();
}

class Toothbrush {
    void hold() {
        System.out.println("Toothbrush held in hand");
    }
}

class ElectricToothbrush extends Toothbrush implements Cleanable, Rechargeable {
    public void cleanTeeth() {
        System.out.println("ElectricToothbrush cleaning teeth");
    }

    public void charge() {
        System.out.println("ElectricToothbrush is charging");
    }
}
