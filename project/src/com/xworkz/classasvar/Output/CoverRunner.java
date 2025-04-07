package com.xworkz.prog.Output;

import com.xworkz.prog.casting.BookCover;
import com.xworkz.prog.casting.BookStore;
import com.xworkz.prog.casting.Cover;

public class CoverRunner {
    public static void main(String[] args) {
        Cover cover1 = new Cover();
        cover1.protect();
        cover1.design();
        cover1.grip();
        cover1.waterproof();
        cover1.enhance();

        System.out.println("-----------");

        Cover cover = new BookCover();
        cover.protect();
        cover.design();
        cover.grip();
        cover.waterproof();
        cover.enhance();

        System.out.println("-----------");

        BookCover bookCover = new BookCover();
        bookCover.protect();
        bookCover.design();
        bookCover.grip();
        bookCover.waterproof();
        bookCover.enhance();

        System.out.println("---casting");

        BookStore bookStore = new BookStore();
        bookStore.sell(cover);
        bookStore.sell(bookCover);
        bookStore.sell(cover1);
    }
}
}
