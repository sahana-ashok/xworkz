package com.xworkz.prog.inheritence;

public class SpaceMissionRun {
    public static void main(String[] args) {
        SpaceMission spaceMission=new SpaceMission();
        spaceMission.launch();
        spaceMission.navigate();
        spaceMission.collectData();
        spaceMission.transmitData();
        spaceMission.returnToEarth();
        System.out.println("-------------");
        SpaceMission spaceMission1=new SpaceMissionDetails();
        spaceMission1.launch();
        spaceMission1.navigate();
        spaceMission1.collectData();
        spaceMission1.transmitData();
        spaceMission1.returnToEarth();
    }
}
