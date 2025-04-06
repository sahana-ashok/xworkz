package com.xworkz.prog.inheritance.runner;

import com.xworkz.inheritence.internal.chips.Chips;
import com.xworkz.inheritence.internal.chips.SpicyChips;

public class ChipsRunner {
    public static void main(String[] args) {
        Chips chips1 = new Chips();
        chips1.made();
        chips1.crispy();
        chips1.flavors();
        chips1.packed();
        chips1.snack();

        System.out.println("-----------------");
        Chips chips = new SpicyChips();
        chips.made();
        chips.crispy();
        chips.flavors();
        chips.packed();
        chips.snack();

        System.out.println("-----------------");
        SpicyChips spicyChips = new SpicyChips();
        spicyChips.made();
        spicyChips.crispy();
        spicyChips.flavors();
        spicyChips.packed();
        spicyChips.snack();
    }
}
