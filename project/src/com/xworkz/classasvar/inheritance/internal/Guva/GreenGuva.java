package com.xworkz.prog.inheritance.internal.Guva;

public class GreenGuva extends Guva {
    public GreenGuva() {
        super();
        System.out.println("Running non-arg constructor GreenApple");
    }
    @Override
    public void taste() {
        System.out.println("Guva has a sweet and tangy taste--child");
    }
    @Override
    public void provideNutrition() {
        System.out.println("Guva provides essential nutrients--child");
    }
    @Override
    public void boostImmunity() {
        System.out.println("Guva helps in boosting immunity--child");
    }
    @Override
    public void availableInSeasons() {
        System.out.println("Guva are available in different seasons--child");
    }
    @Override
    public void usedInCooking() {
        System.out.println("Guva is used in making pies and juices--child");
    }
}
