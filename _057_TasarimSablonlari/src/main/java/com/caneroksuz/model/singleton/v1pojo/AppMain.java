package com.caneroksuz.model.singleton.v1pojo;

public class AppMain {
    public static void main(String[] args) {

        Urun urun1 = new Urun();
        urun1.setId(1);
        urun1.setAdi("Kolonya");
        urun1.setFiyafi(10.3f);

        Urun urun2 = new Urun(2,"Patates",2.7f);

        System.out.println(urun1);
        System.out.println(urun2);


    }
}