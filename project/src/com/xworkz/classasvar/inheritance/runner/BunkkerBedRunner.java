package com.xworkz.prog.inheritance.runner;

import com.xworkz.prog.inheritence.internal.bed.KingSizeBed;
import com.xworkz.prog.inheritance.internal.bunkkerbed.BunkkerBed;

public class BunkkerBedRunner {
    public static void main(String[] args) {
        BunkkerBed bed1 = new BunkkerBed();
        bed1.sleep();
        bed1.fold();
        bed1.comfort();
        bed1.decorate();
        bed1.adjust();

        System.out.println("-------------------");
        BunkkerBed bed = new KingSizeBed();
        bed.sleep();
        bed.fold();
        bed.comfort();
        bed.decorate();
        bed.adjust();

        System.out.println("-----------------");
        KingSizeBed kingSizeBed = new KingSizeBed();
        kingSizeBed.sleep();
        kingSizeBed.fold();
        kingSizeBed.comfort();
        kingSizeBed.decorate();
        kingSizeBed.adjust();
    }
}
