package com.xworkz.prog.encapsulation;

public class EncapsulationRun {
    public static void main(String[] args) {
        Encapsulation encapsulation=new Encapsulation();
        encapsulation.setParkName("Ram Mandir Park");
        System.out.println("Park name:"+encapsulation.getParkName());
    }
}
