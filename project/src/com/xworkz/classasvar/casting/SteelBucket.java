package com.xworkz.prog.casting;

public class SteelBucket extends Bucket{
    public SteelBucket() {
        super();
        System.out.println("Running no-arg constructor of SteelBucket -- Child Class");
    }

    @Override
    public void store() {
        System.out.println("Storing water in SteelBucket -- Child Class");
    }

    @Override
    public void carry() {
        System.out.println("Carrying SteelBucket -- Child Class");
    }

    @Override
    public void fill() {
        System.out.println("Filling the SteelBucket -- Child Class");
    }

    @Override
    public void empty() {
        System.out.println("Emptying the SteelBucket -- Child Class");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the SteelBucket -- Child Class");
    }

    public void weight() {
        System.out.println("SteelBucket is heavier and stronger -- Extra Method in Child Class");
    }
}
