package com.xworkz.prog.casting;

public class CottonRug extends Rug{
    public CottonRug() {
        super();
        System.out.println("Running non-arg constructor CottonRug");
    }
    @Override
    public void cover() {
        System.out.println("CottonRug covers the floor smoothly--child");
    }
    @Override
    public void wash() {
        System.out.println("CottonRug is easy to wash--child");
    }
    @Override
    public void fold() {
        System.out.println("CottonRug folds neatly--child");
    }
    @Override
    public void texture() {
        System.out.println("CottonRug has a soft texture--child");
    }
    @Override
    public void design() {
        System.out.println("CottonRug has elegant designs--child");
    }

    public void size(){
        System.out.println("new method size in child class");
    }
}
