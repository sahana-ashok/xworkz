package com.xworkz.prog.tostring.innerfiles;

public class Canvas {
    private int range;
    private String material;
    private double flexibility;

    public Canvas(int range, String material, double flexibility) {
        this.range = range;
        this.material = material;
        this.flexibility = flexibility;
    }

    @Override
    public String toString() {
        return "Canvas [range=" + range + ", material=" + material + ", flexibility=" + flexibility + "]";
    }
    @Override
    public int hashCode(){
        return 4997;
    }
}
