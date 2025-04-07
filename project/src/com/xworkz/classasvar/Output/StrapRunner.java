package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Strap;
import com.xworkz.prog.casting.RubberStrap;
import com.xworkz.prog.casting.SteelStrap;


public class StrapRunner {
    public static void main(String[] args) {
        Strap strap1 = new Strap();
        strap1.bind();
        strap1.stretch();
        strap1.size();
        strap1.material();
        strap1.use();

        System.out.println("-------------------");
        Strap strap = new RubberStrap();
        strap.bind();
        strap.stretch();
        strap.size();
        strap.material();
        strap.use();

        System.out.println("-----------------");
        RubberStrap rubberStrap = new RubberStrap();
        rubberStrap.bind();
        rubberStrap.stretch();
        rubberStrap.size();
        rubberStrap.material();
        rubberStrap.use();

        System.out.println("-------casting");
        SteelStrap steelStrap = new SteelStrap();
        steelStrap.tighten(strap1);
        steelStrap.tighten(strap);
        steelStrap.tighten(rubberStrap);
    }
}
