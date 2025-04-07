package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Bike;
import com.xworkz.prog.casting.Garage;
import com.xworkz.prog.inheritance.internal.superbike.SuperBike;

public class BikeRunner {
    public static void main(String[] args) {
        System.out.println("---------- Bike ----------");
        Bike bike1 = new Bike();
        bike1.transport();
        bike1.wheels();
        bike1.fuel();
        bike1.safety();
        bike1.model();

        System.out.println("---------- SuperBike ----------");
        Bike bike = new SuperBike();
        bike.transport();
        bike.wheels();
        bike.fuel();
        bike.safety();
        bike.model();

        System.out.println("---------- Direct SuperBike ----------");
        SuperBike superBike = new SuperBike();
        superBike.transport();
        superBike.wheels();
        superBike.fuel();
        superBike.safety();
        superBike.model();

        System.out.println("-------casting example------------");
        Garage garage = new Garage();
        garage.park(bike);
        garage.park(bike1);
        garage.park(superBike);
    }

}
