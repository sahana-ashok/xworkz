package com.xworkz.prog.inheritence;

public class BookRun {
    public static void main(String[] args) {
        Book book=new Book();
        book.borrow();
        book.open();
        book.read();
        book.close();
        book.returnBook();
        System.out.println("---------------");
        Book book1=new Library();
        book1.borrow();
        book1.open();
        book1.read();
        book1.close();
        book1.returnBook();
    }
}
