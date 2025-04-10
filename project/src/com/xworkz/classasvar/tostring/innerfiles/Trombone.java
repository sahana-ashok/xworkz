package com.xworkz.prog.tostring.innerfiles;

public class Trombone {
    private int width;
    private String material;
    private double color;

    public Trombone(int width, String material, double color) {
        this.width = width;
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Trombone [width=" + width + ", material=" + material + ", color=" + color + "]";
    }
    @Override
    public int hashCode(){
        return 3367;
    }
}
