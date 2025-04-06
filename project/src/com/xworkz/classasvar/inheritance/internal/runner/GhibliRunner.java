package com.xworkz.prog.inheritance.internal.runner;

import com.xworkz.inheritence.internal.ghibli.Ghibli;
import com.xworkz.inheritence.internal.ghibli.GhibliMovie;

public class GhibliRunner {
    public static void main(String[] args) {
        Ghibli ghibli = new Ghibli();
        ghibli.animate();
        ghibli.story();
        ghibli.inspire();
        ghibli.fantasy();
        ghibli.nature();

        System.out.println("-----------");

        Ghibli ghibli2 = new GhibliMovie();
        ghibli2.animate();
        ghibli2.story();
        ghibli2.inspire();
        ghibli2.fantasy();
        ghibli2.nature();

        System.out.println("-----------");

        GhibliMovie ghibliMovie = new GhibliMovie();
        ghibliMovie.animate();
        ghibliMovie.story();
        ghibliMovie.inspire();
        ghibliMovie.fantasy();
        ghibliMovie.nature();
    }
}
