package com.xworkz.prog.Assesment;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device();
        device.powerOn();
        device.connectToWifi();

        Laptop laptop = new Laptop();
        laptop.displayInfo();
        laptop.restart();
        laptop.powerOff();

        Smartphone smartphone = new Smartphone();
        smartphone.powerOn();
        smartphone.restart();
        smartphone.powerOff();

        Tablet tablet = new Tablet();
        tablet.displayInfo();
        tablet.restart();
        tablet.powerOff();

        Television television = new Television();
        television.powerOn();
        television.connectToWifi();
        television.displayInfo();

        Smartwatch smartwatch = new Smartwatch();
        smartwatch.displayInfo();
        smartwatch.restart();
        smartwatch.powerOff();

        Camera camera = new Camera();
        camera.powerOn();
        camera.restart();
        camera.powerOff();

        Printer printer = new Printer();
        printer.powerOn();
        printer.connectToWifi();
        printer.powerOff();

        Speaker speaker = new Speaker();
        speaker.powerOn();
        speaker.connectToWifi();

    }
}
