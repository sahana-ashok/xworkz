package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Asia;
import com.xworkz.prog.casting.Continent;
import com.xworkz.prog.casting.ContinentShop;

public class ContinentRunner {
    public static void main(String[] args) {

        Continent continent1 = new Continent();
        continent1.countries();
        continent1.population();
        continent1.culture();
        continent1.economy();
        continent1.climate();

        System.out.println("-----------");

        Continent continent = new Asia();
        continent.countries();
        continent.population();
        continent.culture();
        continent.economy();
        continent.climate();

        System.out.println("-----------");

        Asia asia = new Asia();
        asia.countries();
        asia.population();
        asia.culture();
        asia.economy();
        asia.climate();

        System.out.println("----casting-----");
        ContinentShop continentShop = new ContinentShop();
        continentShop.explore(continent);
        continentShop.explore(asia);
        continentShop.explore(continent1);
    }

}
