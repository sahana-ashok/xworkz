package com.xworkz.prog.casting;

public class Devices {
    public Devices() {
        System.out.println("Running non-arg constructor Devices--parent");
    }

    public void powerOn() {
        System.out.println("Devices is powered on--parent");
    }

    public void powerOff() {
        System.out.println("Devices is powered off--parent");
    }

    public void consumeElectricity() {
        System.out.println("Devices consumes electricity--parent");
    }

    public void function() {
        System.out.println("Devices performs a specific function--parent");
    }

    public void brand() {
        System.out.println("Devices has a known brand--parent");
    }
}
