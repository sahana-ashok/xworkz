package com.xworkz.prog.casting.electronicDevice;

public class GadgetCase {

    public void store(ElectronicDevice device) {
        device.powerOn();
        device.powerOff();
        device.battery();
        device.charge();
        device.connect();

        if(device instanceof Mobile) {
            System.out.println("device is instance of Mobile");
            Mobile mobile = (Mobile) device;
            mobile.camera();
        }
    }
}
