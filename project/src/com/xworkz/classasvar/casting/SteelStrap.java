package com.xworkz.prog.casting;

public class SteelStrap {
    public void tighten(Strap strap) {
        strap.bind();
        strap.size();
        strap.use();
        strap.stretch();
        strap.material();

        if (strap instanceof RubberStrap) {
            System.out.println("strap instanceof RubberStrap");
            RubberStrap rubberStrap = (RubberStrap) strap;
            rubberStrap.expand();
        }
    }
}
