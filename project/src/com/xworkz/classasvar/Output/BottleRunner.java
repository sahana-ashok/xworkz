package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Bottle;
import com.xworkz.prog.casting.Storage;
import com.xworkz.prog.inheritance.internal.steelbottle.SteelBottle;

public class BottleRunner {
    public static void main(String[] args) {
        System.out.println("---------- Bottle ----------");
        Bottle bottle = new Bottle();
        bottle.fill();
        bottle.storeWater();
        bottle.storeMilk();
        bottle.madeOfGlass();
        bottle.frozen();

        System.out.println("---------- SteelBottle ----------");
        Bottle steelBottleRef = new SteelBottle();
        steelBottleRef.fill();
        steelBottleRef.storeWater();
        steelBottleRef.storeMilk();
        steelBottleRef.madeOfGlass();
        steelBottleRef.frozen();

        System.out.println("---------- Direct SteelBottle ----------");
        SteelBottle directSteel = new SteelBottle();
        directSteel.fill();
        directSteel.storeWater();
        directSteel.storeMilk();
        directSteel.madeOfGlass();
        directSteel.frozen();

        System.out.println("---------- Casting Example ----------");
        Storage storage = new Storage();
        storage.pack(bottle);
        storage.pack(steelBottleRef);
        storage.pack(directSteel);
    }
}
