package com.xworkz.prog.inheritance.runner;

import com.xworkz.inheritence.internal.bike.Bike;
import com.xworkz.inheritence.internal.bike.SportsBike;
import com.xworkz.prog.inheritance.internal.superbike.SuperBike;

public class SuperBikeRunner {
    public static void main(String[] args) {
        System.out.println("---------- SuperBike ----------");
        SuperBike bike = new SuperBike();
        bike.transport();
        bike.wheels();
        bike.fuel();
        bike.safety();
        bike.model();

        System.out.println("---------- SuperBike ----------");
        SuperBike sportsBike = new SuperBike();
        sportsBike.transport();
        sportsBike.wheels();
        sportsBike.fuel();
        sportsBike.safety();
        sportsBike.model();

        System.out.println("---------- Direct SportsBike ----------");
        SportsBike directSportsBike = new SportsBike();
        directSportsBike.transport();
        directSportsBike.wheels();
        directSportsBike.fuel();
        directSportsBike.safety();
        directSportsBike.model();
    }
}
