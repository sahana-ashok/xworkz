package com.xworkz.prog.tostring.innerfiles;

public class Battery {
    private int flexibility;
    private String power;
    private double texture;

    public Battery(int flexibility, String power, double texture) {
        this.flexibility = flexibility;
        this.power = power;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "Battery: flexibility=" + flexibility + ", power=" + power + ", texture=" + texture ;
    }
    @Override
    public int hashCode(){
        return 800;
    }
}
