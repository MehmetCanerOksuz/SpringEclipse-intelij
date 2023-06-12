package com.caneroksuz._02_gson;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadGSON {

    public static void main(String[] args) {

        BufferedReader bufferedReader = null;
        Gson gson = new Gson();

        try {
            bufferedReader = new BufferedReader(new FileReader("calisanlar2.json"));

            Calisan calisan = gson.fromJson(bufferedReader, Calisan.class);
            System.out.println("ID : " + calisan.getCalisanId());
            System.out.println("ADI : " + calisan.getAdi());
            System.out.println("SOYADI : " + calisan.getSoyadi());
            System.out.println("DEPATMANI : " + calisan.getDepartman());
            System.out.println("MAASI : " + calisan.getMaas());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
