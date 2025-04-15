package com.xworkz.prog.abstractmethod.animal;

public abstract class Animal {
    int age;
    String species;
    double weight;
    boolean isWild;

    Animal(int age) {
        this.age = age;
    }

    Animal(int age, String species) {
        this.age = age;
        this.species = species;
    }

    Animal(int age, String species, double weight, boolean isWild) {
        this.age = age;
        this.species = species;
        this.weight = weight;
        this.isWild = isWild;
    }
}
