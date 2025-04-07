package com.xworkz.prog.casting;

public class GreenGrapes extends Grapes {
    public GreenGrapes() {
        super();
        System.out.println("Running non-arg constructor GreenGrapes");
    }

    @Override
    public void taste() {
        System.out.println("Grapes have a sweet and slightly tart taste--child");
    }

    @Override
    public void provideNutrition() {
        System.out.println("Grapes provide antioxidants and vitamins--child");
    }

    @Override
    public void boostImmunity() {
        System.out.println("Grapes help in boosting immunity--child");
    }

    @Override
    public void availableInSeasons() {
        System.out.println("Grapes are usually available in summer and fall--child");
    }

    @Override
    public void usedInCooking() {
        System.out.println("Grapes are used in making jams, wines, and desserts--child");
    }

    public void crush() {
        System.out.println("New method crush in child class");
    }
}
