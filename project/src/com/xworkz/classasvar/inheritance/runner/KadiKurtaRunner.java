package com.xworkz.prog.inheritance.runner;

import com.xworkz.inheritence.internal.kurta.Kurta;
import com.xworkz.inheritence.internal.kurta.SilkKurta;
import com.xworkz.prog.inheritance.internal.Kadikurta.KadiKurta;

public class KadiKurtaRunner {
    public static void main(String[] args) {
        KadiKurta kurta = new KadiKurta();
        kurta.traditional();
        kurta.comfort();
        kurta.festivalWear();
        kurta.design();
        kurta.pairWithPajama();

        System.out.println("-----------");

        KadiKurta kurta2 = new SilkKurta();
        kurta2.traditional();
        kurta2.comfort();
        kurta2.festivalWear();
        kurta2.design();
        kurta2.pairWithPajama();

        System.out.println("-----------");

        SilkKurta silkKurta = new SilkKurta();
        silkKurta.traditional();
        silkKurta.comfort();
        silkKurta.festivalWear();
        silkKurta.design();
        silkKurta.pairWithPajama();
    }
}
