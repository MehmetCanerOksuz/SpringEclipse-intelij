package com.caneroksuz.ornek2;

import java.util.Scanner;

public class AppMainTryCatchFinally {

    public static void main(String[] args) {



        System.out.println("**************************************");
        System.out.println("********* OKUL OTOMASYONU ************");
        System.out.println("**************************************");

        System.out.println();
        System.out.println("1 - Ders oluştur");
        System.out.println("2 - Ogrenci oluştur");
        System.out.println("3 - Ogrenciye ders ekle");
        System.out.println("4 - Çıkış");

        //Fazladan try - catch yazılmış..
     /*   try {
            int secim = secimYap();
            System.out.println("secilen deger : "+secim);

        }catch (Exception e){
            System.err.println("Istisna : " + e);
        }

        System.out.println("Program kapatıldı");
*/
  /*      int secim = secimYap();
        System.out.println("secilen deger : "+secim);
        System.out.println("Program kapatıldı");
        */

        // bu yeterli...
        System.out.println("secilen deger : "+secimYap());
        System.out.println("Program kapatıldı");

    }

    private static int secimYap() {

        Scanner scanner = new Scanner(System.in);
        int secim=0;
        boolean tekrarDurumu= false;
        do {

            System.out.println("Seçiminizi yapınız");
            try {
                secim = scanner.nextInt();

                if (secim<0 || secim>3){
                    System.out.println("Lütfen 0 1 2 3 değerlerinden birini giriniz");
                    tekrarDurumu = true;
                }else {
                    tekrarDurumu=false;
                }

            }catch (Exception e){
                System.err.println("Istisna : " + e);
            }finally {
                scanner.nextLine();
            }

        }while (tekrarDurumu);

        return secim;
    }


}
