package com.caneroksuz;


import java.io.*;

public class AppMain {
    public static void main(String[] args) {

        Calisan calisan1 = new Calisan();
        calisan1.setAdi("Yiğitcan");
        calisan1.setSoyadi("Abay");
        calisan1.setDepartmani("Teknik Yönetim");
        calisan1.setEmail("abc@abc.com");
        calisan1.setMaasi(68_000);

        Calisan calisan2 = new Calisan("Engin",
                "Ertikmen",
                "Stajyer",
                "aaa@abc.com",
                12_000);

        ObjectOutputStream yazStream = null;
        try {
            FileOutputStream dosya = new FileOutputStream("serilesen.txt");
            yazStream = new ObjectOutputStream(dosya);


            yazStream.writeObject(calisan1);

            System.out.println(calisan1);
            System.out.println("Yazma BAŞARILI");
        } catch (FileNotFoundException e) {
            System.out.println("Yazma BAŞARISIZ");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Yazma BAŞARISIZ");
            throw new RuntimeException(e);
        }finally {
            try {
                yazStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //----------------------------

        ObjectInputStream okuStream = null;
        try {
            FileInputStream okunacakDosya = new FileInputStream("serilesen.txt");
            okuStream = new ObjectInputStream(okunacakDosya);

            Calisan calisan = (Calisan) okuStream.readObject();
            System.out.println(calisan);
            System.out.println("Okuma başarılı");

        } catch (FileNotFoundException e) {
            System.out.println("Okuma başarısız");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Okuma başarısız");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                okuStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}