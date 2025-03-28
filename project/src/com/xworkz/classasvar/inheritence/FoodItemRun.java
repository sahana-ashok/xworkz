package com.xworkz.prog.inheritence;

public class FoodItemRun {
    public static void main(String[] args) {
        FoodItem foodItem=new FoodItem();
        foodItem.prepare();
        foodItem.serve();
        foodItem.getCalories();
        foodItem.addToBill();
        foodItem.applyDiscount();
        System.out.println("--------------");
        FoodItem foodItem1=new FoodItemDetails();
        foodItem1.prepare();
        foodItem1.serve();
        foodItem1.getCalories();
        foodItem1.addToBill();
        foodItem1.applyDiscount();
    }
}
