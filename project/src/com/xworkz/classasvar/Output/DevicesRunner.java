package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Devices;
import com.xworkz.prog.casting.DishWasher;
import com.xworkz.prog.casting.Oven;


public class DevicesRunner {
    public static void main(String[] args) {
        Devices device1 = new Devices();
        device1.powerOn();
        device1.powerOff();
        device1.consumeElectricity();
        device1.function();
        device1.brand();

        System.out.println("-------------------");
        Devices device = new DishWasher();
        device.powerOn();
        device.powerOff();
        device.consumeElectricity();
        device.function();
        device.brand();

        System.out.println("-----------------");
        DishWasher dishWasher = new DishWasher();
        dishWasher.powerOn();
        dishWasher.powerOff();
        dishWasher.consumeElectricity();
        dishWasher.function();
        dishWasher.brand();

        System.out.println("---------casting");
        Oven oven = new Oven();
        oven.start(device);
        oven.start(device1);
        oven.start(dishWasher);
    }
}
