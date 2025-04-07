package com.xworkz.prog.casting;

public class Forest {
    public void observe(Bird bird) {
        bird.fly();
        bird.feathers();
        bird.layEggs();
        bird.sound();
        bird.vision();

        if (bird instanceof Crow) {
            System.out.println("bird is instance of Crow");
            Crow crow = (Crow) bird;
            crow.searchFood();
        }
    }
}
