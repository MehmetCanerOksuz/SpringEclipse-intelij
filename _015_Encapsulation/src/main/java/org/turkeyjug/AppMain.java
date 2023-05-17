package org.turkeyjug;

public class AppMain {
    public static void main(String[] args) {

        Araba araba = new Araba("Mercedes", "Mavi",2023,1000);

        System.out.println(araba);  // Araba da toString yaptığımız için onun içindekileri yazıyor..

        araba = new Araba("Serçedes", "Kırmızı",2000,250);
        System.out.println(araba);

        araba.setMarka("Volvo");
        araba.setModel(2021);
        araba.setMotorHacmi(2500);
        araba.setRenk("Pembe");
        System.out.println(araba);

        int modelSayi =araba.getModel();
        System.out.println(modelSayi);
    }
}
