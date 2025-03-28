package com.xworkz.prog.inheritence;

public class UserRun {
    public static void main(String[] args) {
        User user=new User();
        user.login();
        user.viewProfile();
        user.browseProducts();
        user.buyProduct();
        user.logout();
        System.out.println("---------------");
        User user1=new Seller();
        user1.login();
        user1.viewProfile();
        user1.browseProducts();
        user1.buyProduct();
        user1.logout();
    }
}
