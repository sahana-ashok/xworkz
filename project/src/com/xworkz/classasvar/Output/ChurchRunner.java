package com.xworkz.prog.Output;

import com.xworkz.prog.casting.CatholicChurch;
import com.xworkz.prog.casting.Church;
import com.xworkz.prog.casting.Sister;

public class ChurchRunner {
    public static void main(String[] args) {
        Church church1 = new Church();
        church1.service();
        church1.pray();
        church1.candles();
        church1.hymns();
        church1.bible();

        System.out.println("-----------------");
        Church church = new CatholicChurch();
        church.service();
        church.pray();
        church.candles();
        church.hymns();
        church.bible();

        System.out.println("-----------------");
        CatholicChurch catholicChurch = new CatholicChurch();
        catholicChurch.service();
        catholicChurch.pray();
        catholicChurch.candles();
        catholicChurch.hymns();
        catholicChurch.bible();

        System.out.println("---------- Sister Class Calling ----------");
        Sister sister = new Sister();
        sister.conductPrayer(church);
        sister.conductPrayer(church1);
        sister.conductPrayer(catholicChurch);
    }
}
}
