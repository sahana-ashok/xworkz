package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Chips;
import com.xworkz.prog.casting.Maid;
import com.xworkz.prog.inheritance.internal.potatochips.PotatoChips;

public class ChipsRunner {
    public static void main(String[] args) {

        Chips chips1 = new Chips();
        chips1.made();
        chips1.crispy();
        chips1.flavors();
        chips1.packed();
        chips1.snack();

        System.out.println("-----------------");
        Chips chips = new PotatoChips();
        chips.made();
        chips.crispy();
        chips.flavors();
        chips.packed();
        chips.snack();

        System.out.println("-----------------");
        PotatoChips potatoChips = new PotatoChips();
        potatoChips.made();
        potatoChips.crispy();
        potatoChips.flavors();
        potatoChips.packed();
        potatoChips.snack();

        System.out.println("---------- Maid Class Calling ----------");
        Maid maid = new Maid();
        maid.prepare(chips);
        maid.prepare(chips1);
        maid.prepare(potatoChips);
    }
}
