package com.xworkz.prog.inheritance.internal.cupboard;

public class Cupboard {
    public Cupboard() {
        System.out.println("Running non-arg constructor Cupboard--parent");
    }
    public void lock() {
        System.out.println("Cupboard has a lock--parent");
    }
    public void key() {
        System.out.println("Cupboard has a key--parent");
    }
    public void handle() {
        System.out.println("Cupboard has a handle--parent");
    }
    public void open() {
        System.out.println("Cupboard can be opened--parent");
    }
    public void close() {
        System.out.println("Cupboard can be closed--parent");
    }
}
