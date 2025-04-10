package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Book {
        private String title;
        private String author;
        private int pages;

        public Book(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }

        @Override
        public String toString() {
            return "Book: Title = " + title + ", Author = " + author + ", Pages = " + pages;
        }
    }

