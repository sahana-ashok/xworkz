package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Office {
    private int officeId;
    private String location;
    private int numberOfEmployees;

    public Office(int officeId, String location, int numberOfEmployees) {
        this.officeId = officeId;
        this.location = location;
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Office details: Office ID = " + officeId + ", Location = " + location + ", Number of Employees = " + numberOfEmployees;
    }
}
