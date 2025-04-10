package com.xworkz.prog.tostring.innerfiles;

public class Whiteboard {
    private int shape;
    private String thickness;
    private double size;

    public Whiteboard(int shape, String thickness, double size) {
        this.shape = shape;
        this.thickness = thickness;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Whiteboard [shape=" + shape + ", thickness=" + thickness + ", size=" + size + "]";
    }
    @Override
    public int hashCode(){
        return 67;
    }
}
