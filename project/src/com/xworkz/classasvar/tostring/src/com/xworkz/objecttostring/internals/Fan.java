package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Fan {
    private String brand;
    private int speedLevels;
    private boolean isRemoteControlled;

    public Fan(String brand, int speedLevels, boolean isRemoteControlled) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.isRemoteControlled = isRemoteControlled;
    }

    @Override
    public String toString() {
        return "Fan [Brand = " + brand + ", Speed Levels = " + speedLevels + ", Remote Controlled = " + isRemoteControlled + "]";
    }
}
