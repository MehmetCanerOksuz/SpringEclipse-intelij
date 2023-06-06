package com.caneroksuz;

import java.util.*;
import java.util.stream.Collectors;

public class OtoGaleri implements IOtoGaleri{

    private static List<Araba> arabalar = new ArrayList<>();
    private static List<Musteri> musteriler = new ArrayList<>();
    private  static List<Kasiyer> kasiyerler = new ArrayList<>();
    private static List<Kiralama> kiralamalar = new ArrayList<>();





    public static <T> void listeyeEkle(List<T> gelenList, T gelenNesne){

        gelenList.add(gelenNesne);
    }

    private void musteriOlustur(){
        Musteri musteri1 = new Musteri(1,"Serkan");
        Musteri musteri2 = new Musteri(2,"Burak");
        Musteri musteri3 = new Musteri(3,"Osman");
        Musteri musteri4 = new Musteri(4,"Gizem");
        listeyeEkle(musteriler,musteri1);
        listeyeEkle(musteriler,musteri2);
        listeyeEkle(musteriler,musteri3);
        listeyeEkle(musteriler,musteri4);
    }

    private void kasiyerOlustur(){
        Kasiyer kasiyer1 = new Kasiyer(1,"Ayşe",20000);
        Kasiyer kasiyer2 = new Kasiyer(2,"Fatma",20000);
        Kasiyer kasiyer3 = new Kasiyer(3,"Hayriye",20000);
        listeyeEkle(kasiyerler,kasiyer1);
        listeyeEkle(kasiyerler,kasiyer2);
    }

    private void arabaOlustur(){
        /*
        Araba araba1 = new Araba(1,"Mercedes");
        Araba araba2 = new Araba(2,"BMW");
        Araba araba3 = new Araba(3,"Kartal");
        Araba araba4 = new Araba(4,"Doğan");
        Araba araba5 = new Araba(5,"Şahin");
        Araba araba6 = new Araba(6,"Passat");
        Araba araba7 = new Araba(7,"Volvo");
        Araba araba8 = new Araba(8,"Jaguar");
        Araba araba9 = new Araba(9,"Mazda");
        Araba araba10 = new Araba(10,"Togg");
        listeyeEkle(arabalar,araba1);
        listeyeEkle(arabalar,araba2);
        listeyeEkle(arabalar,araba3);
        listeyeEkle(arabalar,araba4);
        listeyeEkle(arabalar,araba5);
        listeyeEkle(arabalar,araba6);
        listeyeEkle(arabalar,araba7);
        listeyeEkle(arabalar,araba8);
        listeyeEkle(arabalar,araba9);
        listeyeEkle(arabalar,araba10);
        */
        listeyeEkle(arabalar,new Araba(1,"Mercedes"));
        listeyeEkle(arabalar,new Araba(2,"BMW"));
        listeyeEkle(arabalar,new Araba(3,"Kartal"));
        listeyeEkle(arabalar,new Araba(4,"Doğan"));
        listeyeEkle(arabalar,new Araba(5,"Şahin"));
        listeyeEkle(arabalar,new Araba(6,"Passat"));
        listeyeEkle(arabalar,new Araba(7,"Volvo"));
        listeyeEkle(arabalar,new Araba(8,"Jaguar"));
        listeyeEkle(arabalar,new Araba(9,"Mazda"));
        listeyeEkle(arabalar,new Araba(10,"Togg"));

    }

    private void kiralamaOlustur(){
        Kiralama kiralama1 = new Kiralama(1,kasiyerler.get(0),musteriler.get(0),arabalar.get(0));
        arabalar.get(0).setDurum(EDurum.KIRADA);
        Kiralama kiralama2 = new Kiralama(2,kasiyerler.get(0),musteriler.get(0),arabalar.get(1));
        arabalar.get(1).setDurum(EDurum.KIRADA);
        Kiralama kiralama3 = new Kiralama(3,kasiyerler.get(0),musteriler.get(0),arabalar.get(2));
        arabalar.get(2).setDurum(EDurum.KIRADA);
        Kiralama kiralama4 = new Kiralama(4,kasiyerler.get(0),musteriler.get(0),arabalar.get(3));
        arabalar.get(3).setDurum(EDurum.KIRADA);
        Kiralama kiralama5 = new Kiralama(5,kasiyerler.get(0),musteriler.get(0),arabalar.get(4));
        arabalar.get(4).setDurum(EDurum.KIRADA);
        Kiralama kiralama6 = new Kiralama(6,kasiyerler.get(0),musteriler.get(0),arabalar.get(5));
        arabalar.get(5).setDurum(EDurum.KIRADA);

        listeyeEkle(kiralamalar,kiralama1);
        listeyeEkle(kiralamalar,kiralama2);
        listeyeEkle(kiralamalar,kiralama3);
        listeyeEkle(kiralamalar,kiralama4);
        listeyeEkle(kiralamalar,kiralama5);
        listeyeEkle(kiralamalar,kiralama6);
    }

    @Override
    public boolean kiralamaYap() throws OtoGaleriException{

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kasiyer id : ");
        int kasiyerId = Integer.parseInt(scanner.nextLine());
        Kasiyer kasiyer = kasiyerler.get(kasiyerId-1);

        System.out.println("-----------------------------------------");

        System.out.print("Müşteri id : ");
        int musteriId = Integer.parseInt(scanner.nextLine());
        Musteri musteri = musteriler.get(musteriId-1);

        System.out.println("-----------------------------------------");

        System.out.println("Kirada olmayan arabalar : ");

        arabalar.stream().filter(a ->a.getDurum().equals(EDurum.GALERIDE)).forEach(x ->
                System.out.println(+ x.getId() + " - " + x.getIsim()));

        System.out.println("Lütfen bir seçim yapınız");

        int arabaId = Integer.parseInt(scanner.nextLine());
        Araba araba = arabalar.get(arabaId-1);

        if (araba.getDurum().equals(EDurum.KIRADA)){
            throw new OtoGaleriException("Bu araba kirada.. İşlem başarısız..");
        }else {
            Kiralama kiralama = new Kiralama(kiralamalar.size()+1,kasiyer,musteri,araba);
            kiralamalar.add(kiralama);
            return true;
        }


    }

    @Override
    public Araba arabaAra() throws OtoGaleriException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen araba adını giriniz.");
        String isim = scanner.nextLine();
        Optional<Araba> araba = arabalar.stream().filter(o->o.getIsim().equalsIgnoreCase(isim)).findFirst();


        if (araba.isEmpty()){
            throw new OtoGaleriException("Araba bulunamadı");
        }
        return araba.get();
    }

    @Override
    public Musteri musteriAra() throws OtoGaleriException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen müsteri adını giriniz.");
        String arananMusteri = scanner.nextLine();
        Optional<Musteri> musteri = musteriler.stream().filter(m->m.getIsim().equalsIgnoreCase(arananMusteri)).findFirst();


        if (musteri.isEmpty()){
            throw new OtoGaleriException("Musteri bulunamadı");
        }
        return musteri.get();
    }

    @Override
    public List<Araba> kiralananArabaListesi() throws OtoGaleriException{

        List<Araba> kiralananArabalar = arabalar.stream()
                .filter(oto -> oto.getDurum().equals(EDurum.KIRADA)).collect(Collectors.toList());
        if (kiralananArabalar.isEmpty()){
            throw new OtoGaleriException("Suanda kiralanan araba yok.!");
        }

        return kiralananArabalar;
    }

    public List<Musteri> ganIleBaslayanMusteriler(){

        List<Musteri> musteriList = musteriler.stream()
                .filter(m->m.getIsim().startsWith("Gan"))
                .collect(Collectors.toList());
        return musteriList;
    }

    private List<Musteri> arabaAdinaGoreKiralayanMusteriler(String arabaAdi) {
        List<Musteri> musteriList = kiralamalar.stream()
                .filter(a->a.getAraba().getIsim().equalsIgnoreCase(arabaAdi))
                .map(m->m.getMusteri()).collect(Collectors.toList());

        return musteriList;

    }

    private List<Araba> musteriIdyeGoreKiralananArabalar(int musteriId) {

        return kiralamalar.stream()
                .filter(m->m.getMusteri().getId()==musteriId)
                .map(x->x.getAraba()).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("Oto Galeri Hoşe Geldiniz..");

        OtoGaleri otoGaleri = new OtoGaleri();

        otoGaleri.kasiyerOlustur();
        otoGaleri.musteriOlustur();
        otoGaleri.arabaOlustur();

        listeyeEkle(musteriler,new Musteri(5,"Aminenur"));
        listeyeEkle(kasiyerler,new Kasiyer(4,"Abdullah",20000));
        listeyeEkle(arabalar,new Araba(11,"Toyota"));


        otoGaleri.kiralamaOlustur();

        try{
            System.out.println(otoGaleri.kiralananArabaListesi());
            otoGaleri.arabaAra();
            otoGaleri.kiralamaYap();
            otoGaleri.musteriAra();

        }catch (OtoGaleriException e){
            System.out.println(e);
        }

        System.out.println("Gan ile baslaya müşterilerin listesini bul..");
        otoGaleri.ganIleBaslayanMusteriler().forEach(System.out::println);

        System.out.println("Araba adına göre");
        otoGaleri.arabaAdinaGoreKiralayanMusteriler("BMW").forEach(System.out::println);

        System.out.println("id bilgisi verilen müşterilerin kiraladığı tüm araba listesi");

        otoGaleri.musteriIdyeGoreKiralananArabalar(1).forEach(System.out::println);
    }




}