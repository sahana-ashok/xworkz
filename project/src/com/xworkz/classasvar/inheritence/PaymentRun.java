package com.xworkz.prog.inheritence;

public class PaymentRun {
    public static void main(String[] args) {
        Payment payment=new Payment();
        payment.transaction();
        payment.checkBalance();
        payment.sendAmount();
        payment.recieveAmount();
        payment.closeApp();
        System.out.println("--------------");
        Payment payment1=new CardPayment();
        payment1.transaction();
        payment1.checkBalance();
        payment1.sendAmount();
        payment1.recieveAmount();
        payment1.closeApp();
    }
}
