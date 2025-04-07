package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Bed;
import com.xworkz.prog.casting.BunkBed;
import com.xworkz.prog.casting.Nylon;

public class BedRunner {
    public static void main(String[] args) {
        Bed bed1 = new Bed();
        bed1.sleep();
        bed1.fold();
        bed1.comfort();
        bed1.decorate();
        bed1.adjust();

        System.out.println("-------------------");
        Bed bed = new BunkBed();
        bed.sleep();
        bed.fold();
        bed.comfort();
        bed.decorate();
        bed.adjust();

        System.out.println("-----------------");
        BunkBed bunkBed = new BunkBed();
        bunkBed.sleep();
        bunkBed.fold();
        bunkBed.comfort();
        bunkBed.decorate();
        bunkBed.adjust();

        System.out.println("-----------casting");
        Nylon nylon = new Nylon();
        nylon.madeOf(bed);
        nylon.madeOf(bed1);
        nylon.madeOf(bunkBed);
    }
}
