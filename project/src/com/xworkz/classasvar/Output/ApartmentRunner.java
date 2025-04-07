package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Room;
import com.xworkz.prog.inheritance.internal.building.Building;
import com.xworkz.prog.inheritance.internal.building.House;

public class ApartmentRunner {
    public static void main(String[] args) {
        Building building1 = new Building();
        building1.shelter();
        building1.structure();
        building1.floors();
        building1.foundation();
        building1.rooms();

        System.out.println("-------------------");
        Building building = new House();
        building.shelter();
        building.structure();
        building.floors();
        building.foundation();
        building.rooms();

        System.out.println("-------------------");
        House house = new House();
        house.shelter();
        house.structure();
        house.floors();
        house.foundation();
        house.rooms();

        System.out.println("------casting");
        Room room = new Room();
        room.gents(building);
        room.gents(building1);
        room.gents(house);
    }
}
