package com.xworkz.prog.inheritence123;

public class AnimalRun {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.eat();
        animal.sound();
        animal.fight();
        animal.move();
        animal.sleep();
        System.out.println("----------------------");
        Animal animal1=new Mammal();
        animal1.sleep();
        animal1.move();
        animal1.fight();
        animal1.sound();
        animal1.eat();
    }
}
