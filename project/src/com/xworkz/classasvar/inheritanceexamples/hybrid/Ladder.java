package com.xworkz.prog.inheritanceexamples.hybrid;

interface Extendable {
    void extend();
}

interface Climbable {
    void climb();
}

class Ladder {
    void stand() {
        System.out.println("Ladder standing on floor");
    }
}

class ExtensionLadder extends Ladder implements Extendable, Climbable {
    public void extend() {
        System.out.println("ExtensionLadder extending height");
    }

    public void climb() {
        System.out.println("ExtensionLadder used for climbing");
    }
}
