package com.xworkz.prog.Signal;

public class Place {
    public String circle;
    private String location="Ram mandir";
    int num;

    public void Bangalore(){
        circle="near Bashyam circle";
        System.out.println("Size is:"+this.circle);
        System.out.println("Brand is:"+this.location);
        System.out.println("Number of cloth:"+this.num);
    }
    private void Mandya(){
        System.out.println("running Mandya");
    }
    void Shikaripura(){
        System.out.println("running Shikaripura");
    }
}
}
