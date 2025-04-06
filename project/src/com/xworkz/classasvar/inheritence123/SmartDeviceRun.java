package com.xworkz.prog.inheritence123;

public class SmartDeviceRun {
    public static void main(String[] args) {
        SmartDevice smartDevice=new SmartDevice();
        smartDevice.turnOn();
        smartDevice.connectNetwork();
        smartDevice.sendFiles();
        smartDevice.recieveFiles();
        smartDevice.turnOff();
        System.out.println("-------------");
        SmartDevice smartDevice1=new Reciever();
        smartDevice1.turnOn();
        smartDevice1.connectNetwork();
        smartDevice1.sendFiles();
        smartDevice1.recieveFiles();
        smartDevice1.turnOff();
    }
}
