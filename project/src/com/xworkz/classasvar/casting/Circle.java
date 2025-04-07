package com.xworkz.prog.casting;

import com.xworkz.prog.inheritance.internal.Greenbangles.GoldBangles;

public class Circle {
    public void round(Bangles bangles){
        bangles.design();
        bangles.material();
        bangles.symbol();
        bangles.wear();
        bangles.tradition();

        if(bangles instanceof GoldBangles){
            System.out.println("bangles instanceof GoldBangles");
            GoldBangles goldBangles=(GoldBangles) bangles;
            goldBangles.cost();
        }
    }
}
