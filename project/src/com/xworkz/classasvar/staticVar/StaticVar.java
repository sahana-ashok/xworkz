package com.xworkz.prog.staticVar;

public class StaticVar {
    static String name;
    int total;

    public StaticVar(){
        System.out.println("Running StaticVar constructor");
    }
    static {
        System.out.println("running static block");
        name="Sahana";
    }
}
