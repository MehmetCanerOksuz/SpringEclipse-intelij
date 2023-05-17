package org.example.ders1;

public class Ornek1 {

    enum HaftaninGunleri{
        PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR
    }

    public static void main(String[] args) {

        HaftaninGunleri gunDegeri =HaftaninGunleri.SALI;
        System.out.println(gunDegeri);

        for (HaftaninGunleri gun : HaftaninGunleri.values()){
            System.out.print(gun + " ");
        }
    }
}
