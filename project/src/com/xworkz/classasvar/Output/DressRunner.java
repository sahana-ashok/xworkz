package com.xworkz.prog.Output;

import com.xworkz.prog.Assesment.Dress;
import com.xworkz.prog.casting.dress.PartyDress;
import com.xworkz.prog.casting.dress.Wardrobe;

public class DressRunner {
    public static void main(String[] args) {
        Dress dress1 = new Dress();
        dress1.wear();
        dress1.style();
        dress1.gender();
        dress1.comfort();
        dress1.material();

        System.out.println("-----------");

        Dress dress = new PartyDress();
        dress.wear();
        dress.style();
        dress.gender();
        dress.comfort();
        dress.material();

        System.out.println("-----------");

        PartyDress partyDress = new PartyDress();
        partyDress.wear();
        partyDress.style();
        partyDress.gender();
        partyDress.comfort();
        partyDress.material();

        System.out.println("-----------");

        Wardrobe wardrobe = new Wardrobe();
        wardrobe.display(new PartyDress());
    }
}
