package com.xworkz.prog.abstractmethod.animal;

public class Lion extends Animal{

        public Lion(int age) {
            super(age);
        }

        public Lion(int age, String species) {
            super(age, species);
        }

        public Lion(int age, String species, double weight, boolean isWild) {
            super(age, species, weight, isWild);
        }

        public void displayed() {
            System.out.println("Lion details: " + age + ", " + species + ", " + weight + ", " + isWild);
        }
    }

