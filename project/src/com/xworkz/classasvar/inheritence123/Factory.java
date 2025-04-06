package com.xworkz.prog.inheritence123;

public class Factory extends Staff{
    public void checkIn(){
        System.out.println("Staff checkin");
    }
    public void checkOut(){
        System.out.println("Staff checkout");
    }
    public void duties(){
        System.out.println("Staff perform duties");
    }
    public void getPaid(){
        System.out.println("Staff get paid");
    }
    public void repeat(){
        System.out.println("Staff repeats everyday");
    }
}
