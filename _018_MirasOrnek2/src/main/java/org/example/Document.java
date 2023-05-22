package org.example;

import java.util.Date;

public class Document {
    private String[] authors = new String[5];
    private Date date;

    public String[] getAuthors() {
        return authors;
    }

    public Date getDate() {
        return date;
    }

    public void addAuthor(String name){
        System.out.println("addAuthor metodu");
        authors[0] =name;
    }
}
