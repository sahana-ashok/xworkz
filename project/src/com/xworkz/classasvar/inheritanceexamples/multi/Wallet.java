package com.xworkz.prog.inheritanceexamples.multi;

public class Wallet {
    void storeMoney() {
        System.out.println("Wallet stores physical money");
    }
}

class SmartWallet extends Wallet {
    void trackSpending() {
        System.out.println("SmartWallet tracks your expenses");
    }
}

class DigitalWallet extends SmartWallet {
    void makeOnlinePayment() {
        System.out.println("DigitalWallet makes online payments");
    }
}
