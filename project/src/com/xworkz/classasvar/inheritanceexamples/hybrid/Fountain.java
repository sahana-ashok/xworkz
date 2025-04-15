package com.xworkz.prog.inheritanceexamples.hybrid;

    interface Flowing {
        void flow();
    }

    interface Decorative {
        void decorate();
    }

    class Fountain {
        void spray() {
            System.out.println("Fountain spraying water");
        }
    }

    class GardenFountain extends Fountain implements Flowing, Decorative {
        public void flow() {
            System.out.println("GardenFountain flowing water");
        }

        public void decorate() {
            System.out.println("GardenFountain adds decoration to garden");
        }
    }

