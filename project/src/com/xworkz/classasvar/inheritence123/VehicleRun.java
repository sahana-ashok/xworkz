package com.xworkz.prog.inheritence123;

public class VehicleRun {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.start();
        vehicle.accelerate();
        vehicle.refuel();
        vehicle.destination();
        vehicle.stop();
        System.out.println("-----------------");
        Vehicle vehicle1=new Car();
        vehicle1.start();
        vehicle1.accelerate();
        vehicle1.refuel();
        vehicle1.destination();
        vehicle1.stop();
    }
}
