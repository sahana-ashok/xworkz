package com.xworkz.prog.tostring.innerfiles;

public class Label {
    private int power;
    private String speed;
    private double flexibility;

    public Label(int power, String speed, double flexibility) {
        this.power = power;
        this.speed = speed;
        this.flexibility = flexibility;
    }

    @Override
    public String toString() {
        return "Label [power=" + power + ", speed=" + speed + ", flexibility=" + flexibility + "]";
    }
    @Override
    public int hashCode(){
        return 410;
    }
}
