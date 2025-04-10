package com.xworkz.prog.tostring.innerfiles;

public class Server {
    private int width;
    private String power;
    private double shape;

    public Server(int width, String power, double shape) {
        this.width = width;
        this.power = power;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Server [width=" + width + ", power=" + power + ", shape=" + shape + "]";
    }

    @Override
    public int hashCode(){
        return 9600;
    }
}
