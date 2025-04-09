package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Market {
    private String detail1;
    private int detail2;
    private boolean detail3;

    public Market(String detail1, int detail2, boolean detail3) {
        this.detail1 = detail1;
        this.detail2 = detail2;
        this.detail3 = detail3;
    }

    @Override
    public String toString() {
        return "Market [Detail1 = " + detail1 + ", Detail2 = " + detail2 + ", Detail3 = " + detail3 + "]";
    }


    }
