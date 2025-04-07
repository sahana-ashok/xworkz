package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Door;
import com.xworkz.prog.casting.Lock;
import com.xworkz.prog.inheritance.internal.cupboard.Cupboard;

public class CupboardRunner {
    public static void main(String[] args) {
        Cupboard cupboard1 = new Cupboard();
        cupboard1.lock();
        cupboard1.key();
        cupboard1.handle();
        cupboard1.open();
        cupboard1.close();

        System.out.println("-------------------");
        Cupboard Cupboard = new Door();
        Cupboard.lock();
        Cupboard.key();
        Cupboard.handle();
        Cupboard.open();
        Cupboard.close();

        System.out.println("-------------------");
        Door door = new Door();
        door.lock();
        door.key();
        door.handle();
        door.open();
        door.close();

        System.out.println("-------- Casting Example ----------");
        Lock lock = new Lock();
        lock.secure(Cupboard);
        lock.secure(door);
        lock.secure(cupboard1);
    }

}
