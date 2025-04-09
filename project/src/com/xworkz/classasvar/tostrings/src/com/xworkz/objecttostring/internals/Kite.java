package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Kite {

        private String shape;
        private String color;
        private int height;

        public Kite(String shape, String color, int height) {
            this.shape = shape;
            this.color = color;
            this.height = height;
        }

        @Override
        public String toString() {
            return "Kite [Shape = " + shape + ", Color = " + color + ", Max Height = " + height + " ft]";
        }
    }

