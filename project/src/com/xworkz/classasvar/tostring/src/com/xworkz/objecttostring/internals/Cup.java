package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Cup {
        private String color;
        private String material;
        private double capacity;

        public Cup(String color, String material, double capacity) {
            this.color = color;
            this.material = material;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Cup [Color = " + color + ", Material = " + material + ", Capacity = " + capacity + "ml]";
        }

}
