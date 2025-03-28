package com.xworkz.prog.inheritence;

public class PenRun {
    public static void main(String[] args) {
        Pen pen=new Pen();
        pen.ink();
        pen.brand();
        pen.material();
        pen.retractable();
        pen.type();
        System.out.println("---------------");
        Pen pen1=new PenDetails();
        pen1.type();
        pen1.material();
        pen1.retractable();
        pen1.brand();
        pen1.ink();
    }
}
