package com.xworkz.prog.inheritance.runner;

import com.xworkz.prog.inheritance.internal.Guva.GreenGuva;
import com.xworkz.prog.inheritence.internal.apple.GreenApple;
import com.xworkz.prog.inheritance.internal.fruit.Guva;

public class GuvaRunner {
    public static void main(String[] args) {
        Guva Guva1 = new Guva();
        Guva1.taste();
        Guva1.provideNutrition();
        Guva1.boostImmunity();
        Guva1.availableInSeasons();
        Guva1.usedInCooking();
        
        System.out.println("-------------------");
        Guva guva = new GreenGuva();
        Guva.taste();
        Guva.provideNutrition();
        Guva.boostImmunity();
        Guva.availableInSeasons();
        Guva.usedInCooking();

        System.out.println("-----------------");
        GreenGuva greenguva = new GreenGuva();
        GreenGuva.taste();
        GreenGuva.provideNutrition();
        GreenGuva.boostImmunity();
        GreenGuva.availableInSeasons();
        GreenGuva.usedInCooking();
    }
}
