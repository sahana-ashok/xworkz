package com.xworkz.prog.inheritanceexamples.hybrid;

interface Clickable {
    void clickPhoto();
}

interface Zoomable {
    void zoomLens();
}

class Camera {
    void powerOn() {
        System.out.println("Camera powered on");
    }
}

class DSLR extends Camera implements Clickable, Zoomable {
    public void clickPhoto() {
        System.out.println("DSLR clicking high-resolution photo");
    }

    public void zoomLens() {
        System.out.println("DSLR zooming lens");
    }
}
