package org.example;

public class AppMain {
    public static void main(String[] args) {

        Book book = new Book();
        book.addAuthor("Caner Öksüz");
        System.out.println(book.getAuthors()[0]);
    }
}