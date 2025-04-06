package com.xworkz.prog.inheritence123;

public class WatchRun {
    public static void main(String[] args) {
        Watch watch=new Watch();
        watch.brand();
        watch.caseMaterial();
        watch.color();
        watch.movement();
        watch.waterResistance();
        watch.caseMaterial();
        System.out.println("---------------");
        Watch watch1=new WatchDetails();
        watch1.caseMaterial();
        watch1.movement();
        watch1.waterResistance();
        watch1.color();
        watch1.brand();
    }
}
