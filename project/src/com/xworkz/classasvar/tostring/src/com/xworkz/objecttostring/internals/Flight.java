package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Flight {
    private String airline;
    private int flightNumber;
    private String destination;

    public Flight(String airline, int flightNumber, String destination) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Flight [Airline = " + airline + ", Flight Number = " + flightNumber + ", Destination = " + destination + "]";
    }
}
