package com.xworkz.prog.inheritanceexamples.hybrid;

interface Printable {
    void print();
}

interface Scanable {
    void scan();
}

class Printer {
    void connect() {
        System.out.println("Printer connected to system");
    }
}

class LaserPrinter extends Printer implements Printable, Scanable {
    public void print() {
        System.out.println("LaserPrinter printing document");
    }

    public void scan() {
        System.out.println("LaserPrinter scanning document");
    }
}

