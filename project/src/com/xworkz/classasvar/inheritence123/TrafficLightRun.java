package com.xworkz.prog.inheritence123;

public class TrafficLightRun {
    public static void main(String[] args) {
        TrafficLight trafficLight=new TrafficLight();
        trafficLight.lightsNo();
        trafficLight.control();
        trafficLight.mounnting();
        trafficLight.purpose();
        trafficLight.shape();
        System.out.println("-------------");
        TrafficLight trafficLight1=new TrafficLightDetails();
        trafficLight1.shape();
        trafficLight1.purpose();
        trafficLight1.mounnting();
        trafficLight1.control();
        trafficLight1.lightsNo();
    }
}
