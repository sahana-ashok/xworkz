package com.xworkz.prog.inheritanceexamples.multi;

public class Curtain {
    void blockLight() {
        System.out.println("Curtain blocks sunlight");
    }
}

class WindowCurtain extends Curtain {
    void decorateRoom() {
        System.out.println("WindowCurtain adds aesthetic appeal");
    }
}

class BlackoutCurtain extends WindowCurtain {
    void blockAllLight() {
        System.out.println("BlackoutCurtain blocks all light completely");
    }
}
