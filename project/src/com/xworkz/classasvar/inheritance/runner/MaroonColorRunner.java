package com.xworkz.prog.inheritance.runner;

import com.xworkz.inheritence.internal.color.Color;
import com.xworkz.inheritence.internal.color.Red;
import com.xworkz.prog.inheritance.internal.Marooncolor.MaroonColor;

public class MaroonColorRunner {
    public static void main(String[] args) {
        MaroonColor color1 = new MaroonColor();
        color1.display();
        color1.mix();
        color1.brighten();
        color1.fade();

        System.out.println("-----------");

        MaroonColor color = new Red();
        color.display();
        color.mix();
        color.brighten();
        color.fade();

        System.out.println("-----------");

        Red red = new Red();
        red.display();
        red.mix();
        red.brighten();
        red.fade();
    }
}
