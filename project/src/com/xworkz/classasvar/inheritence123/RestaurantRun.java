package com.xworkz.prog.inheritence123;

public class RestaurantRun {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant();
        restaurant.clockIn();
        restaurant.duties();
        restaurant.salary();
        restaurant.clockOut();
        restaurant.repeat();
        System.out.println("-------------");
        Restaurant restaurant1=new Chef();
        restaurant1.clockIn();
        restaurant1.duties();
        restaurant1.salary();
        restaurant1.clockOut();
        restaurant1.repeat();
    }
}
