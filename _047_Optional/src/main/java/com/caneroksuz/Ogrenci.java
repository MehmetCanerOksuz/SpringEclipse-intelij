package com.caneroksuz;

public class Ogrenci {

    private static long numerator =1l;
    long id;
    String name;

    public Ogrenci(String name) {
        this.id = numerator++;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
