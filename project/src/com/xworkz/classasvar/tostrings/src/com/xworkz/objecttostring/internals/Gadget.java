package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Gadget {

        private String type;
        private String brand;
        private int warrantyYears;

        public Gadget(String type, String brand, int warrantyYears) {
            this.type = type;
            this.brand = brand;
            this.warrantyYears = warrantyYears;
        }

        @Override
        public String toString() {
            return "Gadget [Type = " + type + ", Brand = " + brand + ", Warranty = " + warrantyYears + " years]";
        }
    }

