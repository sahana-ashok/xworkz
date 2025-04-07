package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Bank;
import com.xworkz.prog.casting.Currency;
import com.xworkz.prog.casting.Dollar;

public class CurrencyRunner {
    public static void main(String[] args) {
        Currency currency1 = new Currency();
        currency1.value();
        currency1.rate();
        currency1.symbol();
        currency1.usage();

        System.out.println("-----------");

        Currency currency = new Dollar();
        currency.value();
        currency.rate();
        currency.symbol();
        currency.usage();

        System.out.println("-----------");

        Dollar dollar = new Dollar();
        dollar.value();
        dollar.rate();
        dollar.symbol();
        dollar.usage();

        System.out.println("---casting");
        Bank bank = new Bank();
        bank.exchange(currency1);
        bank.exchange(currency);
        bank.exchange(dollar);
    }
}
}
