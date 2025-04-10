package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Camera {
    private String brand;
    private String type;
    private double resolution;

    public Camera(String brand, String type, double resolution) {
        this.brand = brand;
        this.type = type;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Camera [Brand = " + brand + ", Type = " + type + ", Resolution = " + resolution + "MP]";
    }
}
