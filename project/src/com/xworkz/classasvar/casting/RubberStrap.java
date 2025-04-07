package com.xworkz.prog.casting;

public class RubberStrap extends Strap {
    public RubberStrap() {
        super();
        System.out.println("Running non-arg constructor RubberStrap");
    }

    @Override
    public void bind() {
        System.out.println("RubberStrap is used for binding--child");
    }

    @Override
    public void stretch() {
        System.out.println("RubberStrap can stretch more--child");
    }

    @Override
    public void size() {
        System.out.println("RubberStrap comes in various sizes--child");
    }

    @Override
    public void material() {
        System.out.println("RubberStrap is made of soft elastic--child");
    }

    @Override
    public void use() {
        System.out.println("RubberStrap is used in multiple ways--child");
    }

    public void expand() {
        System.out.println("New method expand in child class");
    }
}
