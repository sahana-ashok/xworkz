package com.xworkz.prog.inheritanceexamples.hybrid;

interface Writable {
    void write();
}

interface Bindable {
    void bind();
}

class Notebook {
    void open() {
        System.out.println("Notebook opened");
    }
}

class SpiralNotebook extends Notebook implements Writable, Bindable {
    public void write() {
        System.out.println("SpiralNotebook is used for writing");
    }

    public void bind() {
        System.out.println("SpiralNotebook uses spiral binding");
    }
}
