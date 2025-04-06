package com.xworkz.prog.inheritance.internal.runner;

import com.xworkz.inheritence.internal.doll.Doll;
import com.xworkz.inheritence.internal.doll.BarbieDoll;

public class DollRunner {
    public static void main(String[] args) {
        Doll doll1 = new Doll();
        doll1.play();
        doll1.dress();
        doll1.talk();
        doll1.move();
        doll1.collect();

        System.out.println("-----------");

        Doll doll = new BarbieDoll();
        doll.play();
        doll.dress();
        doll.talk();
        doll.move();
        doll.collect();

        System.out.println("-----------");

        BarbieDoll barbie = new BarbieDoll();
        barbie.play();
        barbie.dress();
        barbie.talk();
        barbie.move();
        barbie.collect();
    }
}
