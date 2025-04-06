package com.xworkz.prog.inheritance.runner;

import com.xworkz.inheritence.internal.mug.Mug;
import com.xworkz.inheritence.internal.mug.CoffeeMug;
import com.xworkz.prog.inheritance.internal.Teamug.TeaMug;

public class TeaMugRunner {
    public static void main(String[] args) {
        TeaMug mug = new TeaMug();
        mug.drink();
        mug.material();
        mug.handle();
        mug.design();
        mug.hot();

        System.out.println("-----------");

        TeaMug mug2 = new TeaMug();
        mug2.drink();
        mug2.material();
        mug2.handle();
        mug2.design();
        mug2.hot();

        System.out.println("-----------");

        CoffeeMug coffeeMug = new CoffeeMug();
        coffeeMug.drink();
        coffeeMug.material();
        coffeeMug.handle();
        coffeeMug.design();
        coffeeMug.hot();
    }
}
