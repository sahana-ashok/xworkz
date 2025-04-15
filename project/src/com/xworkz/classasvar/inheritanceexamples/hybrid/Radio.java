package com.xworkz.prog.inheritanceexamples.hybrid;

interface Playable {
    void play();
}

interface Tunable {
    void tune();
}

class Radio {
    void powerOn() {
        System.out.println("Radio is powered on");
    }
}

class FMRadio extends Radio implements Playable, Tunable {
    public void play() {
        System.out.println("FMRadio playing songs");
    }

    public void tune() {
        System.out.println("FMRadio tuning to frequency");
    }
}
