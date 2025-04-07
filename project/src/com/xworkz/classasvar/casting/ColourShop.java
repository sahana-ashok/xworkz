package com.xworkz.prog.casting;

public class ColourShop {
    public void purchase(Colour colour) {
        colour.display();
        colour.mix();
        colour.brighten();
        colour.fade();

        if (colour instanceof Red) {
            System.out.println("colour instanceof Red");
            Red red = (Red) colour;
            red.shade();
        }
    }
}
