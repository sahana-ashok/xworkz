package com.xworkz.prog.Output;

import com.xworkz.prog.casting.ChikenKurta;
import com.xworkz.prog.casting.Kurta;
import com.xworkz.prog.casting.Tailor;

public class KurtaRunner {
    public static void main(String[] args) {

        Kurta kurta1 = new Kurta();
        kurta1.art();
        kurta1.handMade();
        kurta1.origin();
        kurta1.design();
        kurta1.fabric();

        System.out.println("-------------------");

        Kurta kurta = new ChikenKurta();
        kurta.art();
        kurta.handMade();
        kurta.origin();
        kurta.design();
        kurta.fabric();

        System.out.println("-----------------");

        ChikenKurta chikenKurta = new ChikenKurta();
        chikenKurta.art();
        chikenKurta.handMade();
        chikenKurta.origin();
        chikenKurta.design();
        chikenKurta.fabric();

        System.out.println("---------- Tailor Class Calling ----------");

        Tailor tailor = new Tailor();
        tailor.checkQuality(kurta);
        tailor.checkQuality(kurta1);
        tailor.checkQuality(chikenKurta);
    }
}
