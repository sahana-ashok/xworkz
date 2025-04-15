package com.xworkz.prog.inheritanceexamples.multi;

public class Sofa {

    void sit() {
        System.out.println("Sofa is for sitting");
    }
}

class LeatherSofa extends Sofa {
    void feelLuxurious() {
        System.out.println("LeatherSofa feels luxurious");
    }
}

class ReclinerSofa extends LeatherSofa {
    void reclineBack() {
        System.out.println("ReclinerSofa reclines back");
    }
}
