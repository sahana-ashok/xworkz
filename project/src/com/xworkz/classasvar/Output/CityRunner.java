package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Nagar;
import com.xworkz.prog.govt.City;
import com.xworkz.prog.casting.Shimoga;




public class CityRunner {
    public static void main(String[] args) {
        City city1 = new City();
        city1.people();
        city1.roads();
        city1.visit();
        city1.life();
        city1.business();

        System.out.println("-----------");

        City city = new Shimoga();
        city.people();
        city.roads();
        city.visit();
        city.life();
        city.business();

        System.out.println("-----------");

        Shimoga shimoga = new Shimoga();
        shimoga.people();
        shimoga.roads();
        shimoga.visit();
        shimoga.life();
        shimoga.business();
        shimoga.jogFalls();

        System.out.println("-----------");

        Nagar nagar = new Nagar();
        nagar.manageCity(shimoga);
        nagar.manageCity(city1);
        nagar.manageCity(city);
    }
}
