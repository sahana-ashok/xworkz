package com.xworkz.prog.inheritence;

public class IdliRun {
    public static void main(String[] args) {
        Idli idli=new Idli();
        idli.ingridients();
        idli.preparation();
        idli.servedWith();
        idli.taste();
        idli.texture();
        System.out.println("-------------");
        Idli idli1=new IdliDetails();
        idli1.texture();
        idli1.taste();
        idli1.servedWith();
        idli1.preparation();
        idli1.ingridients();
    }
}
