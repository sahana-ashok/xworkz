package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Engine {

        private String model;
        private int horsepower;

        public Engine(String model, int horsepower) {
            this.model = model;
            this.horsepower = horsepower;
        }

        @Override
        public String toString() {
            return "Engine [Model = " + model + ", Horsepower = " + horsepower + "]";
        }

}
