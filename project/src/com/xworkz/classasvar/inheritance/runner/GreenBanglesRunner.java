package com.xworkz.prog.inheritance.runner;

import com.xworkz.prog.inheritance.internal.Greenbangles.GreenBangles;
import com.xworkz.prog.inheritence.internal.bangles.Bangles;
import com.xworkz.prog.inheritence.internal.bangles.GoldBangles;

public class GreenBanglesRunner {
    public static void main(String[] args) {
        GreenBangles greenbangles1 = new GreenBangles();
        greenbangles1.wear();
        greenbangles1.material();
        greenbangles1.tradition();
        greenbangles1.design();
        greenbangles1.symbol();

        System.out.println("-------------------");
        GreenBangles bangles = new GoldBangles();
        bangles.wear();
        bangles.material();
        bangles.tradition();
        bangles.design();
        bangles.symbol();

        System.out.println("-----------------");
        GoldBangles goldBangles = new GoldBangles();
        goldBangles.wear();
        goldBangles.material();
        goldBangles.tradition();
        goldBangles.design();
        goldBangles.symbol();
    }
}
