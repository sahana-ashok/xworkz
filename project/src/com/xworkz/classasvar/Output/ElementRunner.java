package com.xworkz.prog.Output;

import com.xworkz.prog.casting.element.Chemical;
import com.xworkz.prog.casting.element.Element;
import com.xworkz.prog.casting.element.Oxygen;

public class ElementRunner {
    public static void main(String[] args) {
        Element element = new Element();
        element.atomicNumber();
        element.symbol();
        element.state();
        element.bonding();
        element.reactivity();

        System.out.println("-----------");

        Element oxygenElement = new Oxygen();
        oxygenElement.atomicNumber();
        oxygenElement.symbol();
        oxygenElement.state();
        oxygenElement.bonding();
        oxygenElement.reactivity();

        System.out.println("-----------");

        Oxygen oxygen = new Oxygen();
        oxygen.atomicNumber();
        oxygen.symbol();
        oxygen.state();
        oxygen.bonding();
        oxygen.reactivity();

        System.out.println("-----------");

        Chemical chemical = new Chemical();
        chemical.property(element);

        chemical.property(oxygenElement);

        chemical.property(oxygen);
    }
}
