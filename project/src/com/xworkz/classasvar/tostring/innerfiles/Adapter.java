package com.xworkz.prog.tostring.innerfiles;

public class Adapter {
    private int range;
    private String color;
    private double size;

    public Adapter(int range, String color, double size) {
        this.range = range;
        this.color = color;
        this.size = size;
    }
    @Override
    public String toString() {
        return "Adapter has :range= " + range + ", color= " + color + ", size= " + size ;
    }
    @Override
    public int hashCode(){
        return 99;
    }
}
