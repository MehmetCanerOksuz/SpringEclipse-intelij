package org.example.ders3;

public class Siparis {

    String pizzaBoyutu;
    enum Boyut {
        KUCUK, ORTA, BUYUK, EKSTRA_BUYUK
    }

    public Siparis(){

    }

    public Siparis(String pizzaBoyutu) {
        this.pizzaBoyutu = pizzaBoyutu;
    }

    public static void main(String[] args) {
        Siparis siparis = new Siparis();
        siparis.pizzaBoyutu = Boyut.ORTA.toString();
        System.out.println(siparis.pizzaBoyutu);

        siparis.pizzaBoyutu = Boyut.BUYUK.toString();
        System.out.println(siparis.pizzaBoyutu);

        Siparis siparis2 = new Siparis("Büyük");
        System.out.println(siparis2.pizzaBoyutu);

        Siparis siparis3 = new Siparis(Boyut.BUYUK.toString());
        System.out.println(siparis3.pizzaBoyutu);

    }
}
