package com.xworkz.prog.tostring.innerfiles;

public class Faucet {
    private int thickness;
    private String texture;
    private double range;

    public Faucet(int thickness, String texture, double range) {
        this.thickness = thickness;
        this.texture = texture;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Faucet [thickness=" + thickness + ", texture=" + texture + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 801023;
    }
}
