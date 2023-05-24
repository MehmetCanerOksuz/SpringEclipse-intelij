package com.caneroksuz;

import com.caneroksuz.okul.Ders;
import com.caneroksuz.okul.Ogrenci;
import com.caneroksuz.okul.Ogretmen;
import com.caneroksuz.okul.Sinif;
import com.caneroksuz.utils.Branslar;
import com.caneroksuz.utils.Dersler;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setAd("Aminenur");
        ogretmen.setSoyad("Göynük");
        ogretmen.setBrans(Branslar.Matematik);
        ogretmen.setTelefon("021245652");
        ogretmen.setAdres("Ankara");

        Ogretmen ogretmen2 = new Ogretmen(Branslar.Ingilizce,"Aysu","Çağışlar",
                "04564876523","İzmir");

        List<Ogretmen> ogretmenList = new ArrayList<>();
        ogretmenList.add(ogretmen);
        ogretmenList.add(ogretmen2);



        List<Ders> dersList = new ArrayList<>();
        dersList.add( new Ders(Dersler.Geometri,ogretmen,0,0));
        dersList.add( new Ders(Dersler.Matematik,ogretmen,0,0));
        dersList.add( new Ders(Dersler.Ingilizce,ogretmen2,0,0));

        List<Ogrenci> ogrenciList = new ArrayList<>();
        ogrenciList.add(new Ogrenci("Mehmet", "Oksuz","Çanakkale","123",dersList));
        ogrenciList.add(new Ogrenci("Orhun", "Bayırdır","Adana","101",dersList.subList(1,2)));

        Sinif sinif = new Sinif(20,true,false,"101-Aziz Sancar",ogrenciList);

        System.out.println(sinif.getOgrenciListesi().get(0).getDersListesi().get(0).getOgretmen());
    }
}
