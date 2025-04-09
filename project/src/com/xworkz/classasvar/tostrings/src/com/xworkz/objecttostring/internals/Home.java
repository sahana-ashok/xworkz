package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Home {
    private String address;
    private int numberOfRooms;
    private boolean hasGarden;

    public Home(String address, int numberOfRooms, boolean hasGarden) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "Home details: Address = " + address + ", Number of Rooms = " + numberOfRooms + ", Has Garden = " + hasGarden;
    }
}
