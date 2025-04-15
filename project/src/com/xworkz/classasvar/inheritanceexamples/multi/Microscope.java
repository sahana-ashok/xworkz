package com.xworkz.prog.inheritanceexamples.multi;

public class Microscope {
    void magnify() {
        System.out.println("Microscope magnifies objects");
    }
}

class OpticalMicroscope extends Microscope {
    void useLenses() {
        System.out.println("OpticalMicroscope uses lenses");
    }
}

class DigitalMicroscope extends OpticalMicroscope {
    void captureImage() {
        System.out.println("DigitalMicroscope captures images digitally");
    }
}
