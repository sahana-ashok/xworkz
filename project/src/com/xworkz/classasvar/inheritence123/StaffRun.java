package com.xworkz.prog.inheritence123;

public class StaffRun {
    public static void main(String[] args) {
        Staff staff=new Staff();
        staff.checkIn();
        staff.duties();
        staff.getPaid();
        staff.checkOut();
        staff.repeat();
        System.out.println("-------------");
        Staff staff1=new Factory();
        staff1.checkIn();
        staff1.duties();
        staff1.getPaid();
        staff1.checkOut();
        staff1.repeat();
    }
}
