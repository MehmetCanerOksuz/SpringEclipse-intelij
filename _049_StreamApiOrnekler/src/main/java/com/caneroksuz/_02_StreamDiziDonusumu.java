package com.caneroksuz;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class _02_StreamDiziDonusumu {

    public static void main(String[] args) {

        var kelimeDizisi = new String[] {"S","a","l","i","h"};

        String sonucToplam= "";
        for (String harf: kelimeDizisi) {
            sonucToplam+=harf;
            System.out.println(harf);
        }

        System.out.println(sonucToplam);

        System.out.println("---------------");

        Stream<String> streamIfade = Stream.of("S","a","l","i","h");
        String yeniIfade = streamIfade.reduce((s1, s2) -> s1+s2).get();
        System.out.println(yeniIfade);

        System.out.println("---------------");

        Stream<String> isimListesi = Stream.of("Salih","Gizem","Abdullah","Ali","Ahmet");

        Optional<String> enKisaIsim = isimListesi.min((s1,s2)-> s1.length() - s2.length());
        enKisaIsim.ifPresent(System.out::println);

        System.out.println("---------------");

        Stream<String> isimListesiArama = Stream.of("Ünal","Gani","Salih","Gizem","Abdullah","Ali","Ahmet","Aysu");
        //isimListesiArama.filter(x->x.contains("a")).forEach(System.out::println);
        //isimListesiArama.filter(x->x.contains("i")).forEach(System.out::println);
        isimListesiArama.filter(x->x.length()==4).forEach(System.out::println);

        List<Personel> personelList = new ArrayList<>();
        personelList.add(new Personel("Ahmet","Akkoyun"));
        personelList.add(new Personel("Ali","Güneş"));
        personelList.add(new Personel("Ünal Gani","Berk"));
        personelList.add(new Personel("Osman Onur","Baş"));
        personelList.add(new Personel("Aminenur","Göynük"));

        personelList
                .stream()
                .filter(p ->p.getAd().contains("i") && p.getSoyad().length()>4)
                .forEach(System.out::println);
    }
}
