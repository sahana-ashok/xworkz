package com.xworkz.prog.inheritence123;

public class TableRun {
    public static void main(String[] args) {
        Table table=new Table();
        table.shape();
        table.material();
        table.length();
        table.legsNo();
        table.use();
        System.out.println("--------------");
        Table table1=new TableDetails();
        table1.shape();
        table1.material();
        table1.length();
        table1.legsNo();
        table1.use();
    }
}
