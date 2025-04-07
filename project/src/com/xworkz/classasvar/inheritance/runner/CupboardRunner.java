package com.xworkz.prog.inheritance.runner;

import com.xworkz.inheritence.internal.caboard.Caboard;
import com.xworkz.inheritence.internal.caboard.Door;
import com.xworkz.prog.inheritance.internal.cupboard.Cupboard;

public class CupboardRunner {
    public static void main(String[] args) {
        Cupboard Cupboard1 = new Cupboard();
        Cupboard1.lock();
        Cupboard1.key();
        Cupboard1.handle();
        Cupboard1.open();
        Cupboard1.close();

        System.out.println("-------------------");
        Cupboard caboard = new Door();
        caboard.lock();
        caboard.key();
        caboard.handle();
        caboard.open();
        caboard.close();

        System.out.println("-------------------");
        Door door = new Door();
        door.lock();
        door.key();
        door.handle();
        door.open();
        door.close();
    }

}
