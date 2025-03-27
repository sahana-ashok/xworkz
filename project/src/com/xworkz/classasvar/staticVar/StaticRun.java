package com.xworkz.prog.staticVar;

public class StaticRun {
    public static void main(String[] args) {
        System.out.println("Static Block:" +StaticVar.name);
        StaticVar staticVar=new StaticVar();
        staticVar.total=600;

        StaticVar staticVar1=new StaticVar();
    }
}
