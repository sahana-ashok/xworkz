package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Island {
        private String name;
        private int area;

        public Island(String name, int area) {
            this.name = name;
            this.area = area;
        }

        @Override
        public String toString() {
            return "Island [Name = " + name + ", Area = " + area + " sq km]";
        }
    }

