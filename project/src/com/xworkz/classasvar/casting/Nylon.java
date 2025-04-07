package com.xworkz.prog.casting;

public class Nylon {
    public void madeOf(Bed bed){
        bed.adjust();
        bed.comfort();
        bed.fold();
        bed.sleep();
        bed.decorate();

        if(bed instanceof BunkBed){
            System.out.println("bed instanceof BunkBed");
            BunkBed bunkBed = (BunkBed) bed;
            bunkBed.climb();
        }
    }
}
