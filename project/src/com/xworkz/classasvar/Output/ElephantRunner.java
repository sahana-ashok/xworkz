package com.xworkz.prog.Output;

import com.xworkz.prog.Assesment.Animal;
import com.xworkz.prog.Assesment.Elephant;
import com.xworkz.prog.casting.elephant.AfricanElephant;

public class ElephantRunner {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        elephant.eat();
        elephant.drinkWater();
        elephant.trumpet();
        elephant.useTrunk();
        elephant.walkSlowly();

        System.out.println("-----------");

        Elephant africanElephantRef = new AfricanElephant();
        africanElephantRef.eat();
        africanElephantRef.drinkWater();
        africanElephantRef.trumpet();
        africanElephantRef.useTrunk();
        africanElephantRef.walkSlowly();

        System.out.println("-----------");

        AfricanElephant africanElephant = new AfricanElephant();
        africanElephant.eat();
        africanElephant.drinkWater();
        africanElephant.trumpet();
        africanElephant.useTrunk();
        africanElephant.walkSlowly();

        System.out.println("-----------");

        Animal animal = new Animal();
        animal.habitat(elephant);
        animal.habitat(africanElephantRef);
        animal.habitat(africanElephant);
    }
}
