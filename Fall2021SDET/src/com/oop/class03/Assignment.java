package com.oop.class03;

class Book {
    String name;
    static int pages;

    void printBook() {
        System.out.println(name);
        System.out.println(pages);
    }

}

public class Assignment {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        b1.name = "Bible";
        b1.pages = 451;

        b2.name = "Notes";
        b2.pages = 270;

        b3.name = "Manual";
        b3.pages = 900;

        b1.printBook();
        b2.printBook();
        b3.printBook();
    }
}
