package com.xworkz.prog.inheritanceexamples.hybrid;

interface Adjustable {
    void adjustHeight();
}

interface Supportive {
    void supportDevice();
}

class Tripod {
    void unfold() {
        System.out.println("Tripod unfolded");
    }
}

class CameraTripod extends Tripod implements Adjustable, Supportive {
    public void adjustHeight() {
        System.out.println("CameraTripod adjusting height");
    }

    public void supportDevice() {
        System.out.println("CameraTripod supporting camera");
    }
}
