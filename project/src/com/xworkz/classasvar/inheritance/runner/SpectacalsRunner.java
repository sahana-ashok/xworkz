package com.xworkz.prog.inheritance.runner;

import com.xworkz.inheritence.internal.spects.Spects;
import com.xworkz.inheritence.internal.spects.Sunglasses;
import com.xworkz.prog.inheritance.internal.spectacals.Spectacals;

public class SpectacalsRunner {
    public static void main(String[] args) {
        Spectacals spects = new Spectacals();
        spects.vision();
        spects.lenses();
        spects.frame();
        spects.protect();
        spects.customize();

        System.out.println("-----------");

        Spectacals spects2 = new Sunglasses();
        spects2.vision();
        spects2.lenses();
        spects2.frame();
        spects2.protect();
        spects2.customize();

        System.out.println("-----------");

        Sunglasses sunglasses = new Sunglasses();
        sunglasses.vision();
        sunglasses.lenses();
        sunglasses.frame();
        sunglasses.protect();
        sunglasses.customize();
    }
}
