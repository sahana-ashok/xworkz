package com.xworkz.prog.Output;

import com.xworkz.prog.casting.fruit.Fruit;
import com.xworkz.prog.casting.fruit.Sweet;
import com.xworkz.prog.inheritance.internal.fruit.Apple;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.taste();
        fruit.color();
        fruit.nutrients();
        fruit.seasonal();
        fruit.seeds();

        System.out.println("-----------");

        Fruit fruit2 = new Apple();
        fruit2.taste();
        fruit2.color();
        fruit2.nutrients();
        fruit2.seasonal();
        fruit2.seeds();

        System.out.println("-----------");

        Apple apple = new Apple();
        apple.taste();
        apple.color();
        apple.nutrients();
        apple.seasonal();
        apple.seeds();

        System.out.println("-----------casting");
        Sweet sweet=new Sweet();
        sweet.size(fruit);
        sweet.size(fruit2);
        sweet.size(apple);

    }
}
