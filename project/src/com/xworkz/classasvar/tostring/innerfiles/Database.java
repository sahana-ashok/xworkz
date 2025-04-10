package com.xworkz.prog.tostring.innerfiles;

public class Database {
    private int material;
    private String duration;
    private double quantity;

    public Database(int material, String duration, double quantity) {
        this.material = material;
        this.duration = duration;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Database [material=" + material + ", duration=" + duration + ", material=" + quantity + "]";
    }
    @Override
    public int hashCode(){
        return 6897;
    }
}
