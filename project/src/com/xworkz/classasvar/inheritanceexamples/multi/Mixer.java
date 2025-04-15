package com.xworkz.prog.inheritanceexamples.multi;

public class Mixer {
    void blend() {
        System.out.println("Mixer blends ingredients");
    }
}

class ElectricMixer extends Mixer {
    void runMotor() {
        System.out.println("ElectricMixer runs using electricity");
    }
}

class HandMixer extends ElectricMixer {
    void controlSpeed() {
        System.out.println("HandMixer allows speed control");
    }
}
