package com.xworkz.prog.casting;

public class Gym extends Exercise{
    public Gym() {
        super();
        System.out.println("Running no-arg constructor Gym");
    }

    @Override
    public void perform() {
        System.out.println("Performing workouts in the gym--child");
    }

    @Override
    public void duration() {
        System.out.println("Gym workouts last for an hour--child");
    }

    @Override
    public void type() {
        System.out.println("Gym includes cardio and weight training--child");
    }

    @Override
    public void benefit() {
        System.out.println("Gym improves strength and endurance--child");
    }

    @Override
    public void repeat() {
        System.out.println("Gym exercises are repeated weekly--child");
    }

    public void membership() {
        System.out.println("New method membership in child class Gym");
    }

}
