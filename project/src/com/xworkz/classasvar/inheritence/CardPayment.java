package com.xworkz.prog.inheritence;

public class CardPayment extends Payment{
    public void transaction(){
        System.out.println("Online Transaction");
    }
    public void sendAmount(){
        System.out.println("Send amount");
    }
    public void recieveAmount(){
        System.out.println("Recieve amount");
    }
    public void checkBalance(){
        System.out.println("Check balance");
    }
    public void closeApp(){
        System.out.println("Close app");
    }
}
