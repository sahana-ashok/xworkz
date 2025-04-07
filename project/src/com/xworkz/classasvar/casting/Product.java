package com.xworkz.prog.casting;

public class Product {
    public void use(Grapes grapes) {
        grapes.availableInSeasons();
        grapes.boostImmunity();
        grapes.provideNutrition();
        grapes.taste();
        grapes.usedInCooking();

        if (grapes instanceof GreenGrapes) {
            System.out.println("grapes instance of GreenGrapes");
            GreenGrapes greenGrapes = (GreenGrapes) grapes;
            greenGrapes.crush();
        }
    }
}
