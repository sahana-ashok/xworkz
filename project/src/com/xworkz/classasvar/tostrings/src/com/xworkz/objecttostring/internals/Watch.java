package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Watch {

        private String brand;
        private String type;
        private boolean isDigital;

        public Watch(String brand, String type, boolean isDigital) {
            this.brand = brand;
            this.type = type;
            this.isDigital = isDigital;
        }

        @Override
        public String toString() {
            return "Watch [Brand = " + brand + ", Type = " + type + ", Digital = " + isDigital + "]";
        }
    }


