package com.xworkz.prog.Assesment;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.brake();
        vehicle.accelerate();
        vehicle.startEngine();

    Truck truck = new Truck();
        truck.brake();
        truck.stopEngine();

    Boat boat = new Boat();
        boat.startEngine();
        boat.accelerate();
        boat.honk();


    Train train = new Train();
        train.startEngine();
        train.brake();
        train.stopEngine();

    Bus bus = new Bus();
        bus.startEngine();
        bus.accelerate();
        bus.stopEngine();

    Bicycle bicycle = new Bicycle();
        bicycle.startEngine();
        bicycle.accelerate();
        bicycle.honk();

    Helicopter helicopter = new Helicopter();
        helicopter.startEngine();
        helicopter.brake();
        helicopter.stopEngine();

    Ship ship = new Ship();
        ship.honk();
        ship.brake();
        ship.stopEngine();
}
}

