package com.xworkz.prog.tostring.innerfiles;

public class Pipe {
    private int range;
    private String power;
    private double size;

    public Pipe(int range, String power, double size) {
        this.range = range;
        this.power = power;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pipe [range=" + range + ", power=" + power + ", size=" + size + "]";
    }
    @Override
    public int hashCode(){
        return 2003;
    }
}
