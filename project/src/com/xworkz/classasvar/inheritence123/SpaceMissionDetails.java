package com.xworkz.prog.inheritence123;

public class SpaceMissionDetails extends SpaceMission{
    public void launch(){
        System.out.println("Launch the rocket");
    }
    public void navigate(){
        System.out.println("Navigate the mission");
    }
    public void collectData(){
        System.out.println("Collect the data");
    }
    public void transmitData(){
        System.out.println("Transmit data");
    }
    public void returnToEarth(){
        System.out.println("Rocket returned to Earth");
    }

}
