package com.xworkz.prog.Output;

import com.xworkz.prog.Assesment.Laptop;
import com.xworkz.prog.casting.laptop.GamingLaptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.runSoftware();
        laptop.providePortability();
        laptop.connectToInternet();
        laptop.supportMultitasking();
        laptop.longBatteryLife();

        System.out.println("-----------");

        Laptop laptop2 = new GamingLaptop();
        laptop2.runSoftware();
        laptop2.providePortability();
        laptop2.connectToInternet();
        laptop2.supportMultitasking();
        laptop2.longBatteryLife();

        System.out.println("-----------");

        GamingLaptop gamingLaptop = new GamingLaptop();
        gamingLaptop.runSoftware();
        gamingLaptop.providePortability();
        gamingLaptop.connectToInternet();
        gamingLaptop.supportMultitasking();
        gamingLaptop.longBatteryLife();
    }
}
