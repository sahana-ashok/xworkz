package com.xworkz.prog.casting;

public class Charge {
    public void chargeCar(Car car) {
        car.comfort();
        car.engine();
        car.models();
        car.wheels();
        car.transport();

        if (car instanceof EvCar) {
            System.out.println("car instanceof EvCar");
            EvCar evCar = (EvCar) car;
            evCar.range();
        }
    }
}
