package com.xworkz.prog.inheritanceexamples.multi;

public class Helmet {
    void protectHead() {
        System.out.println("Helmet protects the head");
        }
    }

    class SafetyHelmet extends Helmet {
        void absorbShock() {
            System.out.println("SafetyHelmet absorbs shock");
        }
    }

    class RacingHelmet extends SafetyHelmet {
        void reduceDrag() {
            System.out.println("RacingHelmet reduces air drag");
        }
    }

