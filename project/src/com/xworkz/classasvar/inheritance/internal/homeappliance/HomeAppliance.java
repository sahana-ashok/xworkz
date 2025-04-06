package com.xworkz.prog.inheritance.internal.homeappliance;

public class HomeAppliance {
    public HomeAppliance() {
        System.out.println("Running non-arg constructor Appliance--parent");
    }
    public void powerOn() {
        System.out.println("HomeAppliance is powered on--parent");
    }
    public void powerOff() {
        System.out.println("HomeAppliance is powered off--parent");
    }
    public void consumeElectricity() {
        System.out.println("HomeAppliance consumes electricity--parent");
    }
    public void function() {
        System.out.println("HomeAppliance performs a function--parent");
    }
    public void brand() {
        System.out.println("HomeAppliance has a brand--parent");
    }
}
