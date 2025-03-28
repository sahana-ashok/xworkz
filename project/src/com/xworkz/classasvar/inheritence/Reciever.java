package com.xworkz.prog.inheritence;

public class Reciever extends SmartDevice{
    public void turnOn(){
        System.out.println("Device on");
    }
    public void turnOff(){
        System.out.println("Device off");
    }
    public void connectNetwork(){
        System.out.println("Connect to network");
    }
    public void sendFiles(){
        System.out.println("Send files");
    }
    public void recieveFiles(){
        System.out.println("Recieve Files");
    }
}
