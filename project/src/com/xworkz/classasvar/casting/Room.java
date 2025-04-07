package com.xworkz.prog.casting;

import com.xworkz.prog.inheritance.internal.building.Building;

public class Room {
    public void gents(Building building) {
        building.floors();
        building.foundation();
        building.rooms();
        building.shelter();
        building.structure();

        if (building instanceof House) {
            System.out.println("building instanceof House");
            House house = (House) building;
            house.door();
        }
    }
}
