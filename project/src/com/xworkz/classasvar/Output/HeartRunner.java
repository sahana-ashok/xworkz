package com.xworkz.prog.Output;

import com.xworkz.prog.casting.heart.HealthyHeart;
import com.xworkz.prog.casting.heart.Heart;
import com.xworkz.prog.casting.heart.Organ;

public class HeartRunner {
    public static void main(String[] args) {
        Heart heart = new Heart();
        heart.pump();
        heart.beat();
        heart.oxygen();
        heart.waste();
        heart.circulate();

        System.out.println("-----------");

        Heart heart2 = new HealthyHeart();
        heart2.pump();
        heart2.beat();
        heart2.oxygen();
        heart2.waste();
        heart2.circulate();

        System.out.println("-----------");

        HealthyHeart healthyHeart = new HealthyHeart();
        healthyHeart.pump();
        healthyHeart.beat();
        healthyHeart.oxygen();
        healthyHeart.waste();
        healthyHeart.circulate();

        System.out.println("---------casting");
        Organ organ=new Organ();
        organ.center(heart);
        organ.center(heart2);
        organ.center(healthyHeart);
    }
}
