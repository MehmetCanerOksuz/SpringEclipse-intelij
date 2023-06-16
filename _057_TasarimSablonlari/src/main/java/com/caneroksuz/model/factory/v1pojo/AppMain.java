package com.caneroksuz.model.factory.v1pojo;

public class AppMain {

    public static void main(String[] args) {

        Tasima tasima;
        tasima = TasimaFactory.builder(ETasimaTipi.KARA);
        System.out.println(tasima);
        tasima = TasimaFactory.builder(ETasimaTipi.DENIZ);
        System.out.println(tasima);
        tasima = TasimaFactory.builder(ETasimaTipi.HAVA);
        System.out.println(tasima);

    }


}
