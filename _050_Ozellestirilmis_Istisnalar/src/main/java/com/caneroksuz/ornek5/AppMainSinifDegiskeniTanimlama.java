package com.caneroksuz.ornek5;

import java.util.List;
import java.util.Optional;

public class AppMainSinifDegiskeniTanimlama {

    static String ifade;
    static String [] gunler={"Pa","Sa","Ca","Pe","Cu","Ct","Pz"};
    static List<String> ogrencilerListesi;
    public static void main(String[] args) {



        Optional<String []> gunler2 = Optional.ofNullable(gunler);

        System.out.println(gunler2);



    }


}
