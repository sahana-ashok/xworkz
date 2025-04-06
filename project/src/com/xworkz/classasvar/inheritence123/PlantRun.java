package com.xworkz.prog.inheritence123;

public class PlantRun {
    public static void main(String[] args) {
        Plant plant=new Plant();
        plant.color();
        plant.fragrance();
        plant.height();
        plant.requiresSun();
        plant.type();
        System.out.println("----------");
        Plant plant1=new PlantDetails();
        plant1.type();
        plant1.height();
        plant1.requiresSun();
        plant1.fragrance();
        plant1.color();
    }
}
