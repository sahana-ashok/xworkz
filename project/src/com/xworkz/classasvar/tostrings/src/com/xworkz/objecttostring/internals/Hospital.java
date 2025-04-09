package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Hospital {

        private String name;
        private String location;
        private int beds;

        public Hospital(String name, String location, int beds) {
            this.name = name;
            this.location = location;
            this.beds = beds;
        }

        @Override
        public String toString() {
            return "Hospital [Name = " + name + ", Location = " + location + ", Beds = " + beds + "]";
        }
    }

