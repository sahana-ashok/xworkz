package com.xworkz.prog.inheritance.internal.photos;

public class GhibliPhotos extends Photos {
    public GhibliPhotos() {
        super();
        System.out.println("GhibliMovie --child");
    }

    @Override
    public void animate() {
        System.out.println("GhibliPhotos uses hand-drawn animation --child");
    }

    @Override
    public void story() {
        System.out.println("GhibliPhotos stories have deep meanings --child");
    }

    @Override
    public void inspire() {
        System.out.println("GhibliPhotos characters inspire audiences --child");
    }

    @Override
    public void fantasy() {
        System.out.println("GhibliPhotos blends reality with fantasy --child");
    }

    @Override
    public void nature() {
        System.out.println("GhibliPhotos highlights nature’s beauty --child");
    }
}
