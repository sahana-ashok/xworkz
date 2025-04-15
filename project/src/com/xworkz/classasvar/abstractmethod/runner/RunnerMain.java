package com.xworkz.prog.abstractmethod.runner;

import com.xworkz.prog.abstractmethod.animal.Lion;
import com.xworkz.prog.abstractmethod.future.Goals;
import com.xworkz.prog.abstractmethod.instrument.Guitar;
import com.xworkz.prog.abstractmethod.instrument.Instrument;
import com.xworkz.prog.abstractmethod.ipl.Rcb;
import com.xworkz.prog.abstractmethod.vehicle.Vehicle;
import com.xworkz.prog.abstractmethod.vehicle.Car;

public class RunnerMain {
    public static void main(String[] args) {
        Vehicle drive = new Car();
        drive.startEngine();
        drive.drive();
        System.out.println("*********************************************************************");

        Instrument instrument = new Guitar();
        instrument.play();
        System.out.println("*********************************************************************");

        Goals future=new Goals();
        future.learn();
        future.practice();
        System.out.println("*********************************************************************");

        Rcb match = new Rcb(106, "Red Jersey", false);
        match.display();
        System.out.println("*********************************************************************");

        Lion lion1 = new Lion(4);
        lion1.displayed();
        Lion lion2 = new Lion(6, "Asiatic Lion");
        lion2.displayed();
        Lion lion3 = new Lion(15, "African Lion", 190.5, true);
        lion3.displayed();



    }
}
