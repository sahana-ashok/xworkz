package com.xworkz.prog.encapsulation;

public class Encapsulation {
        private String parkName;
        public Encapsulation(){
            System.out.println("Running Encapsulation method");
        }
        public String getParkName(){
            return this.parkName;
        }
        void setParkName(String parkName){
            this.parkName=parkName;
        }
}
