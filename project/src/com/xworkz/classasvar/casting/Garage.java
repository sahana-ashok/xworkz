package com.xworkz.prog.casting;

public class Garage {
    public void park(Bike bike) {
        bike.transport();
        bike.wheels();
        bike.fuel();
        bike.safety();
        bike.model();

        if (Bike instanceof SuperBike) {
            System.out.println("bike instance of SuperBike");
            SuperBike superBike = (SuperBike) Bike;
            superBike.race();
        }
    }
}