package com.xworkz.prog.Output;

import com.xworkz.prog.casting.food.Burger;
import com.xworkz.prog.casting.food.Craving;
import com.xworkz.prog.casting.food.Food;

public class FoodRunner {
    public static void main(String[] args) {
        Food food1 = new Burger();
        food1.eat();
        food1.taste();
        food1.cook();
        food1.health();
        food1.spice();

        Food food = new Burger();
        food.eat();
        food.taste();
        food.cook();
        food.health();
        food.spice();

        System.out.println("--------------");
        Burger burger = new Burger();
        burger.eat();
        burger.taste();
        burger.cook();
        burger.health();
        burger.spice();

        System.out.println("---------casting");
        Craving craving=new Craving();
        craving.costly(food);
        craving.costly(burger);
        craving.costly(food1);
    }
}
