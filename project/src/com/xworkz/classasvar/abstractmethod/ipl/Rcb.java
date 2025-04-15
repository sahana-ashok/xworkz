package com.xworkz.prog.abstractmethod.ipl;

public class Rcb extends Ipl{
    public Rcb(int runs, String teamColor, boolean matchWon) {
        super(runs, teamColor, matchWon);
    }

    public void display() {
        System.out.println("The match of RCB has status: " + runs + ", " + teamColor + ", " + matchWon);
    }
}
