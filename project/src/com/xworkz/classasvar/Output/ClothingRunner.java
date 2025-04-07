package com.xworkz.prog.Output;

import com.xworkz.prog.Assesment.TShirt;
import com.xworkz.prog.casting.ClothShop;
import com.xworkz.prog.casting.Clothing;

public class ClothingRunner {
    public static void main(String[] args) {
        Clothing clothing1 = new Clothing();
        clothing1.wear();
        clothing1.fabric();
        clothing1.fit();
        clothing1.label();
        clothing1.style();

        System.out.println("-----------");

        Clothing clothing = new TShirt();
        clothing.wear();
        clothing.fabric();
        clothing.fit();
        clothing.label();
        clothing.style();

        System.out.println("-----------");

        TShirt tShirt = new TShirt();
        tShirt.wear();
        tShirt.fabric();
        tShirt.fit();
        tShirt.label();
        tShirt.style();

        System.out.println("---casting");
        ClothShop clothShop=new ClothShop();
        clothShop.purchase(clothing);
        clothShop.purchase(tShirt);
        clothShop.purchase(clothing1);
    }

}
