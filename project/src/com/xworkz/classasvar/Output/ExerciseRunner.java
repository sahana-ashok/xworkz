package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Exercise;
import com.xworkz.prog.casting.Gym;
import com.xworkz.prog.casting.Workout;
public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println("---------- Exercise ----------");
        Exercise exercise = new Exercise();
        exercise.perform();
        exercise.duration();
        exercise.type();
        exercise.benefit();
        exercise.repeat();

        System.out.println("---------- Gym ----------");
        Exercise gymAsExercise = new Gym();
        gymAsExercise.perform();
        gymAsExercise.duration();
        gymAsExercise.type();
        gymAsExercise.benefit();
        gymAsExercise.repeat();

        System.out.println("---------- Direct Gym ----------");
        Gym directGym = new Gym();
        directGym.perform();
        directGym.duration();
        directGym.type();
        directGym.benefit();
        directGym.repeat();

        System.out.println("-------casting example------------");
        Workout workout = new Workout();
        workout.perform(exercise);
        workout.perform(gymAsExercise);
        workout.perform(directGym);
    }

}
