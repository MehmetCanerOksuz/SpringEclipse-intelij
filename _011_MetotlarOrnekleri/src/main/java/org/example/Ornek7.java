package org.example;

public class Ornek7 {

    private static void gosterSonuc(int... sayilar){

        System.out.println("\n\nParametre sayısı => " + sayilar.length);
        int toplam =0;
        for (int sayi : sayilar){
            System.out.print(sayi + " ");
        }

        for( int sayi : sayilar){
            toplam+=sayi;
        }
        System.out.println("\nToplam => " + toplam);
    }


    public static void main(String[] args) {

        gosterSonuc(5,8,6);

        gosterSonuc(5,8,6,7,2);
        gosterSonuc(5,8,6,3,8,4,87,1);
        gosterSonuc(5,8,6,45,78,5,57,87,21,54,5,45);
    }
}
