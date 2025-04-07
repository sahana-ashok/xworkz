package com.xworkz.prog.casting;

public class Tailor {

    public void checkQuality(Kurta kurta) {
        kurta.art();
        kurta.handMade();
        kurta.origin();
        kurta.design();
        kurta.fabric();

        if (kurta instanceof ChikenKurta) {
            System.out.println("kurta instanceof ChikenKurta");
            ChikenKurta chikenKurta = (ChikenKurta) kurta;
            chikenKurta.stitch();
        }
    }
}
