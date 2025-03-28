package com.xworkz.prog.inheritence;

public class MangoRun {
    public static void main(String[] args) {
        Mango mango=new Mango();
        mango.color();
        mango.origin();
        mango.season();
        mango.taste();
        mango.variety();
        System.out.println("----------");
        Mango mango1=new MangoDetails();
        mango1.variety();
        mango1.taste();
        mango1.season();
        mango1.origin();
        mango1.color();
    }

}
