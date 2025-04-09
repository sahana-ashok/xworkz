package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Flower {

        private String name;
        private String color;
        private boolean isFragrant;

        public Flower(String name, String color, boolean isFragrant) {
            this.name = name;
            this.color = color;
            this.isFragrant = isFragrant;
        }

        @Override
        public String toString() {
            return "Flower [Name = " + name + ", Color = " + color + ", Fragrant = " + isFragrant + "]";
        }
    }

