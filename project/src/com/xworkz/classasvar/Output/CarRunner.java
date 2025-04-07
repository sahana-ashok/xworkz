package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Car;
import com.xworkz.prog.casting.Charge;
import com.xworkz.prog.casting.EvCar;

public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.transport();
        car1.wheels();
        car1.engine();
        car1.models();
        car1.comfort();

        System.out.println("-------------------");
        Car car2 = new EvCar();
        car2.transport();
        car2.wheels();
        car2.engine();
        car2.models();
        car2.comfort();

        System.out.println("-----------------");
        EvCar evCar = new EvCar();
        evCar.transport();
        evCar.wheels();
        evCar.engine();
        evCar.models();
        evCar.comfort();

        System.out.println("---casting");
        Charge charge = new Charge();
        charge.chargeCar(car1);
        charge.chargeCar(car2);
        charge.chargeCar(evCar);
    }

}
