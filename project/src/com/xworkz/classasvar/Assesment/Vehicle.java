package com.xworkz.prog.Assesment;

public class Vehicle {
    public Vehicle() {
        System.out.println("Constructor in Vehicle");
    }

    public void startEngine() {
        System.out.println("Vehicle: Engine started.");
    }

    public void stopEngine() {
        System.out.println("Vehicle: Engine stopped.");
    }

    public void accelerate() {
        System.out.println("Vehicle: Accelerating...");
    }

    public void brake() {
        System.out.println("Vehicle: Braking...");
    }

    public void honk() {
        System.out.println("Vehicle: Honking...");
    }
}