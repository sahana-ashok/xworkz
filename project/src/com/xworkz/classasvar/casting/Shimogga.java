package com.xworkz.prog.casting;

public class Shimogga extends Town{
    public Shimoga() {
        super();
        System.out.println("Running non-arg constructor Shimoga--child");
    }

    @Override
    public void people() {
        System.out.println("Shimoga has friendly people--child");
    }

    @Override
    public void roads() {
        System.out.println("Shimoga has well-connected roads--child");
    }

    @Override
    public void visit() {
        System.out.println("Tourists visit Shimoga for nature spots--child");
    }

    @Override
    public void life() {
        System.out.println("Life in Shimoga is calm and balanced--child");
    }

    @Override
    public void business() {
        System.out.println("Shimoga supports local businesses--child");
    }

    public void jogFalls() {
        System.out.println("Jog Falls is a famous spot in Shimoga--child specific method");
    }

}
