package com.xworkz.prog.casting;

public class Oven {
    public void start(Devices devices) {
        devices.brand();
        devices.consumeElectricity();
        devices.function();
        devices.powerOn();
        devices.powerOff();

        if (devices instanceof DishWasher) {
            System.out.println("devices instanceof DishWasher");
            DishWasher dishWasher = (DishWasher) devices;
            dishWasher.capacity();
        }
    }
}
