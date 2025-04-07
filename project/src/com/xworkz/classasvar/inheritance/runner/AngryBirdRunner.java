package com.xworkz.prog.inheritance.runner;

import com.xworkz.inheritence.internal.bird.Bird;
import com.xworkz.inheritence.internal.bird.Eagle;
import com.xworkz.prog.inheritance.internal.angrybird.AngryBird;

public class AngryBirdRunner {
    public static void main(String[] args) {
        System.out.println("---------- Bird ----------");
        AngryBird bird = new AngryBird();
        bird.fly();
        bird.feathers();
        bird.layEggs();
        bird.sound();
        bird.vision();

        System.out.println("---------- Eagle ----------");
        AngryBird eagle = new Eagle();
        eagle.fly();
        eagle.feathers();
        eagle.layEggs();
        eagle.sound();
        eagle.vision();

        System.out.println("---------- Direct Eagle ----------");
        Eagle directEagle = new Eagle();
        directEagle.fly();
        directEagle.feathers();
        directEagle.layEggs();
        directEagle.sound();
        directEagle.vision();
    }
}
