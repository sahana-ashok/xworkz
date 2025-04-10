package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Notebook {
        private int pages;
        private String size;
        private String brand;

        public Notebook(int pages, String size, String brand) {
            this.pages = pages;
            this.size = size;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Notebook [Pages = " + pages + ", Size = " + size + ", Brand = " + brand + "]";
        }

}
