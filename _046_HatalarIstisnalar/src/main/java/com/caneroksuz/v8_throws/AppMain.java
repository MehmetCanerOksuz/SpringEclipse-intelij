package com.caneroksuz.v8_throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AppMain {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            dosyaOku();
        }catch (Exception e){
            System.out.println(e);
        }finally {

        }
    }

    private static void dosyaOku() throws FileNotFoundException {
        File yeniDosya = new File("B:\\myText.txt");
        FileInputStream inputStream = new FileInputStream(yeniDosya);
    }
}
