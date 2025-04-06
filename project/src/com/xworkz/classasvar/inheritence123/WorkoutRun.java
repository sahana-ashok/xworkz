package com.xworkz.prog.inheritence123;

public class WorkoutRun {
    public static void main(String[] args) {
        Workout workout=new Workout();
        workout.startSession();
        workout.showDuration();
        workout.trackCalories();
        workout.saveProggress();
        workout.endSession();
        System.out.println("-------------");
        Workout workout1=new WorkoutDetails();
        workout1.startSession();
        workout1.trackCalories();
        workout1.showDuration();
        workout1.saveProggress();
        workout1.endSession();
    }
}
