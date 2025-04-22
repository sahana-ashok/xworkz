package com.xworkz.prog;

public class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    class Puppy extends Dog {
        void weep() {
            System.out.println("Puppy is weeping");
        }
    }
    


