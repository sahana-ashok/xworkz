package com.xworkz.prog.casting;

public class Maid {
    public void prepare(Chips chips) {
        chips.made();
        chips.crispy();
        chips.flavors();
        chips.packed();
        chips.snack();

        if (chips instanceof PotatoChips) {
            System.out.println("chips instanceof PotatoChips");
            PotatoChips potatoChips = (PotatoChips) chips;
            potatoChips.saltSprinkle();
        }
    }

}
