package com.xworkz.prog.inheritanceexamples.hybrid;

interface Heater {
    void heat();
}

interface Baker {
    void bake();
}

class KitchenAppliance {
    void plugIn() {
        System.out.println("Kitchen appliance is plugged in");
    }
}

class Oven extends KitchenAppliance implements Heater, Baker {
    public void heat() {
        System.out.println("Oven is heating up");
    }

    public void bake() {
        System.out.println("Oven is baking food");
    }
}
