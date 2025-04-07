package com.xworkz.prog.Output;

import com.xworkz.prog.casting.frozenBottle.FrozenBottle;
import com.xworkz.prog.casting.frozenBottle.IceBottle;
import com.xworkz.prog.casting.frozenBottle.Offer;

public class FrozenBottleRunner {
    public static void main(String[] args) {
        FrozenBottle bottle = new FrozenBottle();
        bottle.freeze();
        bottle.cold();
        bottle.cool();
        bottle.melt();
        bottle.carry();

        System.out.println("-----------------");

        FrozenBottle bottle2 = new IceBottle();
        bottle2.freeze();
        bottle2.cold();
        bottle2.cool();
        bottle2.melt();
        bottle2.carry();


        System.out.println("-----------------");

        IceBottle iceBottle = new IceBottle();
        iceBottle.freeze();
        iceBottle.cold();
        iceBottle.cool();
        iceBottle.melt();
        iceBottle.carry();

        System.out.println("-----------casting ");
        Offer offer=new Offer();
        offer.good(bottle);
        offer.good(bottle2);
        offer.good(iceBottle);
    }
}
