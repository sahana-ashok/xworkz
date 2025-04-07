package com.xworkz.prog.casting;

public class BunkBed extends Bed{
    public BunkBed() {
        super();
        System.out.println("Running non-arg constructor BunkBed");
    }

    @Override
    public void sleep() {
        System.out.println("BunkBed is used for sleeping in compact spaces--child");
    }

    @Override
    public void fold() {
        System.out.println("BunkBed can be folded partially--child");
    }

    @Override
    public void comfort() {
        System.out.println("BunkBed provides moderate comfort--child");
    }

    @Override
    public void decorate() {
        System.out.println("BunkBed is decorated with themed bedspreads--child");
    }

    @Override
    public void adjust() {
        System.out.println("BunkBed height can be adjusted slightly--child");
    }

    public void climb() {
        System.out.println("New method climb in child class");
    }
}
