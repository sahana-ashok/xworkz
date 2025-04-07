package com.xworkz.prog.inheritance.internal.Kadikurta;

public class SilkKurta extends KadiKurta {
    public SilkKurta() {
        super();
        System.out.println("SilkKurta --child");
    }

    @Override
    public void traditional() {
        System.out.println("SilkKurta is traditional --child");
    }

    @Override
    public void comfort() {
        System.out.println("SilkKurta is comfortable --child");
    }

    @Override
    public void festivalWear() {
        System.out.println("SilkKurta is worn at festivals --child");
    }

    @Override
    public void design() {
        System.out.println("SilkKurta comes in various designs --child");
    }

    @Override
    public void pairWithPajama() {
        System.out.println("SilkKurta is paired with a pajama --child");
    }
}
