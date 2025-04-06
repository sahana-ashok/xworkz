package com.xworkz.prog.inheritance.runner;

import com.xworkz.inheritence.internal.bottle.Bottle;
import com.xworkz.inheritence.internal.bottle.Cap;
import com.xworkz.prog.inheritance.internal.steelbottle.SteelBottle;

public class SteelBottleRunner {
    public static void main(String[] args) {
        System.out.println("---------- Bottle ----------");
        SteelBottle bottle = new SteelBottle();
        bottle.fill();
        bottle.storeWater();
        bottle.storeMilk();
        bottle.madeOfGlass();
        bottle.frozen();

        System.out.println("---------- Cap ----------");
        SteelBottle cap = new SteelBottle();
        cap.fill();
        cap.storeWater();
        cap.storeMilk();
        cap.madeOfGlass();
        cap.frozen();

        System.out.println("---------- Direct Cap ----------");
        SteelBottle directCap = new SteelBottle();
        directCap.fill();
        directCap.storeWater();
        directCap.storeMilk();
        directCap.madeOfGlass();
        directCap.frozen();
    }
}
