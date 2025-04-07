package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Color;
import com.xworkz.prog.casting.CottonRug;
import com.xworkz.prog.casting.Rug;

public class RugRunner {
    public static void main(String[] args) {
        Rug rug1 = new Rug();
        rug1.cover();
        rug1.wash();
        rug1.fold();
        rug1.texture();
        rug1.design();

        System.out.println("-------------------");
        Rug rug = new CottonRug();
        rug.cover();
        rug.wash();
        rug.fold();
        rug.texture();
        rug.design();

        System.out.println("-----------------");
        CottonRug cottonRug = new CottonRug();
        cottonRug.cover();
        cottonRug.wash();
        cottonRug.fold();
        cottonRug.texture();
        cottonRug.design();

        System.out.println("--------casting");
        Color color = new Color();
        color.select(rug);
        color.select(rug1);
        color.select(cottonRug);
    }
}
