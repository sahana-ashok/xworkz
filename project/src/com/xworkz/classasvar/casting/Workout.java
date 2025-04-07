package com.xworkz.prog.casting;

public class Workout {
    public void perform(Exercise exercise) {
        exercise.perform();
        exercise.duration();
        exercise.type();
        exercise.benefit();
        exercise.repeat();

        if (exercise instanceof Gym) {
            System.out.println("exercise instance of Gym");
            Gym gym = (Gym) exercise;
            gym.membership();
        }
    }
}
