package com.xworkz.prog.Output;

import com.xworkz.prog.casting.furniture.Chair;
import com.xworkz.prog.casting.furniture.Furniture;
import com.xworkz.prog.casting.furniture.Solid;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        furniture.support();
        furniture.material();
        furniture.weight();
        furniture.move();
        furniture.design();

        System.out.println("-----------");

        Furniture furniture2 = new Chair();
        furniture2.support();
        furniture2.material();
        furniture2.weight();
        furniture2.move();
        furniture2.design();

        System.out.println("-----------");

        Chair chair = new Chair();
        chair.support();
        chair.material();
        chair.weight();
        chair.move();
        chair.design();

        System.out.println("-------casting");
        Solid solid=new Solid();
        solid.obj(furniture);
        solid.obj(furniture2);
        solid.obj(chair);
    }
}
