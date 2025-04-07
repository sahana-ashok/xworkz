package com.xworkz.prog.casting;

public class Lock {
    public void secure(Cupboard cupboard) {
        cupboard.lock();
        cupboard.key();
        cupboard.handle();
        cupboard.open();
        cupboard.close();

        if(cupboard instanceof Door) {
            Door door = (Door) cupboard;
            door.knock();
        }
    }
}
