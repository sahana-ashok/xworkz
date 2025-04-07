package com.xworkz.prog.inheritance.runner;

import com.xworkz.inheritence.internal.swim.Swim;
import com.xworkz.inheritence.internal.swim.FreestyleSwim;
import com.xworkz.prog.inheritance.internal.swimming.Swimming;

public class SwimmingRunner {
    public static void main(String[] args) {
        Swimming swim = new Swimming();
        swim.health();
        swim.water();
        swim.exercise();
        swim.sport();
        swim.styles();

        System.out.println("-----------");

        Swimming swim2 = new FreestyleSwim();
        swim2.health();
        swim2.water();
        swim2.exercise();
        swim2.sport();
        swim2.styles();

        System.out.println("-----------");

        FreestyleSwim freestyleSwim = new FreestyleSwim();
        freestyleSwim.health();
        freestyleSwim.water();
        freestyleSwim.exercise();
        freestyleSwim.sport();
        freestyleSwim.styles();
    }
}
