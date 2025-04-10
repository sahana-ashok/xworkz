package com.xworkz.prog.tostring.innerfiles;

public class Raincoat {
    private int size;
    private String speed;
    private double flexibility;

    public Raincoat(int size, String speed, double flexibility) {
        this.size = size;
        this.speed = speed;
        this.flexibility = flexibility;
    }

    @Override
    public String toString() {
        return "Raincoat [size=" + size + ", speed=" + speed + ", flexibility=" + flexibility + "]";
    }
    @Override
    public int hashCode(){
        return 102;
    }
}
