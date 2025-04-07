package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Grapes;
import com.xworkz.prog.casting.GreenGrapes;
import com.xworkz.prog.casting.Product;

public class GrapesRunner {
    public static void main(String[] args) {
        Grapes grapes1 = new Grapes();
        grapes1.taste();
        grapes1.provideNutrition();
        grapes1.boostImmunity();
        grapes1.availableInSeasons();
        grapes1.usedInCooking();

        System.out.println("-------------------");
        Grapes grapes = new GreenGrapes();
        grapes.taste();
        grapes.provideNutrition();
        grapes.boostImmunity();
        grapes.availableInSeasons();
        grapes.usedInCooking();

        System.out.println("-----------------");
        GreenGrapes greenGrapes = new GreenGrapes();
        greenGrapes.taste();
        greenGrapes.provideNutrition();
        greenGrapes.boostImmunity();
        greenGrapes.availableInSeasons();
        greenGrapes.usedInCooking();

        System.out.println("-------casting example------------");
        Product product = new Product();
        product.use(grapes);
        product.use(grapes1);
        product.use(greenGrapes);
    }
}
