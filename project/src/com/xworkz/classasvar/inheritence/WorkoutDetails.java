package com.xworkz.prog.inheritence;

public class WorkoutDetails extends Workout {
    public void startSession(){
        System.out.println("Start workout session");
    }
    public void endSession(){
        System.out.println("End workout session");
    }
    public void trackCalories(){
        System.out.println("Track calories");
    }
    public void showDuration(){
        System.out.println("Workout duration");
    }
    public void saveProggress(){
        System.out.println("Save workout progress");
    }
}
