package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Bird;
import com.xworkz.prog.casting.Crow;
import com.xworkz.prog.casting.Forest;

public class BirdRunner {
    public static void main(String[] args) {
        System.out.println("---------- Bird ----------");
        Bird bird = new Bird();
        bird.fly();
        bird.feathers();
        bird.layEggs();
        bird.sound();
        bird.vision();

        System.out.println("---------- Crow ----------");
        Bird crow = new Crow();
        crow.fly();
        crow.feathers();
        crow.layEggs();
        crow.sound();
        crow.vision();

        System.out.println("---------- Direct Crow ----------");
        Crow directCrow = new Crow();
        directCrow.fly();
        directCrow.feathers();
        directCrow.layEggs();
        directCrow.sound();
        directCrow.vision();

        System.out.println("-------casting example------------");
        Forest forest = new Forest();
        forest.observe(bird);
        forest.observe(crow);
        forest.observe(directCrow);
    }
}
