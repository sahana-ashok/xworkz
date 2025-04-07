package com.xworkz.prog.casting.hair;

public class Black {
    public void cool(Hair hair){
        hair.grow();
        hair.keratin();
        hair.maintain();
        hair.protect();
        hair.style();

        if(hair instanceof CurlyHair){
            System.out.println("hair instanceof CurlyHair");
            CurlyHair curlyHair=(CurlyHair) hair;
            curlyHair.comb();
        }
    }
}
