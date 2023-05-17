package org.example.ders1;

public class Ornek2 {

    enum HaftaninGunleri{
        PAZARTESI, SALI, CARSAMBA, PERSEMBE(7), CUMA, CUMARTESI("Spor"), PAZAR ("Tatil");

        String mesaj;
        int mesaj1;
        HaftaninGunleri() {
            System.out.println("Varsayılan - parametresiz");
        }
        HaftaninGunleri(String mesaj) {
            this.mesaj = mesaj;
            System.out.println("Parametreli : " + mesaj);
        }

        HaftaninGunleri(int mesaj1) {
            this.mesaj1 = mesaj1;
        }

    }

    public static void main(String[] args) {

        for (HaftaninGunleri gun : HaftaninGunleri.values()){
            if(gun.mesaj1 != 0) {
                System.out.println("\n" + gun + " " + gun.mesaj1);
            }
        }

    }
}
