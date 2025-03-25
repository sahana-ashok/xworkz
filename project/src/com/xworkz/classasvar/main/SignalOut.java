package com.xworkz.prog.main;

import com.xworkz.city.Metropolitan;
import com.xworkz.city.Normal;
import com.xworkz.city2.Population;

public class SignalOut {
    public static void main(String[] args) {
        Metropolitan metropolitan=new Metropolitan();
        Normal normal=new Normal();
        normal.loc();

        Population population=new Population();
        population.high();
    }

}
