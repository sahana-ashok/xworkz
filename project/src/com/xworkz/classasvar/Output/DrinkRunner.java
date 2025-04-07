package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Bottle;
import com.xworkz.prog.casting.drink.Drink;
import com.xworkz.prog.casting.drink.Juice;

public class DrinkRunner {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.sip();
        drink1.refresh();
        drink1.cold();
        drink1.sweet();
        drink1.healthy();

        System.out.println("-----------");

        Drink drink = new Juice();
        drink.sip();
        drink.refresh();
        drink.cold();
        drink.sweet();
        drink.healthy();

        System.out.println("-----------");

        Juice juice = new Juice();
        juice.sip();
        juice.refresh();
        juice.cold();
        juice.sweet();
        juice.healthy();

        System.out.println("-----------");

        Bottle bottle = new Bottle();
        bottle.display(drink1);

        System.out.println("-----------");

        bottle.display(drink);

        System.out.println("-----------");

        bottle.display(juice);
    }
}
