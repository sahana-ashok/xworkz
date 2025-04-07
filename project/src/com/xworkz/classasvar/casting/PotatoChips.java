package com.xworkz.prog.casting;

public class PotatoChips extends Chips {
        public PotatoChips() {
            super();
            System.out.println("Running non-arg constructor PotatoChips--child");
        }

        @Override
        public void made() {
            System.out.println("PotatoChips made from fresh potatoes--child");
        }

        @Override
        public void crispy() {
            System.out.println("PotatoChips are super crispy--child");
        }

        @Override
        public void flavors() {
            System.out.println("PotatoChips come in multiple flavors--child");
        }

        @Override
        public void packed() {
            System.out.println("PotatoChips are vacuum packed--child");
        }

        @Override
        public void snack() {
            System.out.println("PotatoChips are everyone's favorite snack--child");
        }

        public void saltSprinkle() {
            System.out.println("Salt sprinkled on PotatoChips--child");
        }
    }

}
