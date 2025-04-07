package com.xworkz.prog.casting;

public class Storage {
    public void pack(Bottle bottle) {
        bottle.fill();
        bottle.storeWater();
        bottle.storeMilk();
        bottle.madeOfGlass();
        bottle.frozen();

        if (bottle instanceof SteelBottle) {
            System.out.println("bottle instance of SteelBottle");
            SteelBottle steelBottle = (SteelBottle) bottle;
            steelBottle.insulate();
        }
    }
}
