package com.xworkz.prog.abstractmethod.ipl;

public abstract class Ipl {
    int runs;
    String teamColor;
    boolean matchWon;

    public Ipl(int runs, String teamColor, boolean matchWon) {
        this.runs = runs;
        this.teamColor = teamColor;
        this.matchWon = matchWon;
    }
}
