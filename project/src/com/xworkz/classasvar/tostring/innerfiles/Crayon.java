package com.xworkz.prog.tostring.innerfiles;

public class Crayon {
    private int material;
    private String flexibility;
    private double power;

    public Crayon(int material, String flexibility, double power) {
        this.material = material;
        this.flexibility = flexibility;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Crayon [material=" + material + ", flexibility=" + flexibility + ", power=" + power + "]";
    }
    @Override
    public int hashCode(){
        return 85897;
    }
}
