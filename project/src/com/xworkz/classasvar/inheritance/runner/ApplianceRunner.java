package com.xworkz.prog.inheritance.runner;

import com.xworkz.prog.inheritence.internal.appliance.WashingMachine;
import com.xworkz.prog.inheritance.internal.homeappliance.HomeAppliance;

public class HomeApplianceRunner {
    public static void main(String[] args) {
        HomeAppliance appliance1 = new HomeAppliance();
        appliance1.powerOn();
        appliance1.powerOff();
        appliance1.consumeElectricity();
        appliance1.function();
        appliance1.brand();

        System.out.println("-------------------");
        Appliance appliance = new WashingMachine();
        appliance.powerOn();
        appliance.powerOff();
        appliance.consumeElectricity();
        appliance.function();
        appliance.brand();

        System.out.println("-----------------");
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.powerOn();
        washingMachine.powerOff();
        washingMachine.consumeElectricity();
        washingMachine.function();
        washingMachine.brand();
    }
}
