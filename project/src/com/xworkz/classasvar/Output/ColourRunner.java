package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Colour;
import com.xworkz.prog.casting.ColourShop;
import com.xworkz.prog.casting.Red;

public class ColourRunner {
    public static void main(String[] args) {

        Colour colour1 = new Colour();
        colour1.display();
        colour1.mix();
        colour1.brighten();
        colour1.fade();

        System.out.println("-----------");

        Colour colour = new Red();
        colour.display();
        colour.mix();
        colour.brighten();
        colour.fade();

        System.out.println("-----------");

        Red red = new Red();
        red.display();
        red.mix();
        red.brighten();
        red.fade();
        red.shade();

        System.out.println("---casting");

        ColourShop colourShop = new ColourShop();
        colourShop.purchase(colour);
        colourShop.purchase(red);
        colourShop.purchase(colour1);
    }

}
