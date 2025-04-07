package com.xworkz.prog.casting;

public class Nagar {
    public void manageCity(Town town) {
        town.people();
        town.roads();
        town.visit();
        town.life();
        town.business();

        if (town instanceof Shimoga) {
            System.out.println("town instanceof Shimoga");
            Shimoga shimoga = (Shimoga) town;
            shimoga.jogFalls();
        }
    }
}
