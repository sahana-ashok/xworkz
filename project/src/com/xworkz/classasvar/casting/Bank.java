package com.xworkz.prog.casting;

public class Bank {
    public void exchange(Currency currency) {
        currency.value();
        currency.rate();
        currency.symbol();
        currency.usage();

        if (currency instanceof Dollar) {
            System.out.println("currency instanceof Dollar");
            Dollar dollar = (Dollar) currency;
            dollar.country();
        }
    }
}
