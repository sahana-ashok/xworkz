package com.xworkz.prog.main;

import com.xworkz.cloths.Cloth;
import com.xworkz.cloths.Sale;
import com.xworkz.cloths2.Customer;

public class ClothesOut {
    public static void main(String[] args) {

        Cloth cloth=new Cloth();
        cloth.color();

        Sale sale=new Sale();
        sale.dept();

        Customer customer=new Customer();
        customer.cloth();

    }

}
