package com.xworkz.prog.casting;

public class Town {
    public Town() {
        System.out.println("Running non-arg constructor Town--parent");
    }

    public void people() {
        System.out.println("Town has a smaller population--parent");
    }

    public void roads() {
        System.out.println("Town has basic infrastructure--parent");
    }

    public void visit() {
        System.out.println("Town has local tourist spots--parent");
    }

    public void life() {
        System.out.println("Town has a peaceful lifestyle--parent");
    }

    public void business() {
        System.out.println("Town supports small businesses--parent");
    }
}
