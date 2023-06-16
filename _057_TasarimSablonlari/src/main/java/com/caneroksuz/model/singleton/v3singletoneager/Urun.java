package com.caneroksuz.model.singleton.v3singletoneager;

public class Urun {

    private static volatile Urun nesne = new Urun();
    private Long id;
    private String adi;
    private Double fiyafi;

    private Urun() {
    }

    private Urun(Long id, String adi, Double fiyafi) {
        this.id = id;
        this.adi = adi;
        this.fiyafi = fiyafi;
    }

          //Urun için Singleton nesne kontrolu yapılacak..
    public static Urun getInstance(){
      //  if (nesne == null)
      //      nesne = new Urun();
        return nesne;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Double getFiyafi() {
        return fiyafi;
    }

    public void setFiyafi(Double fiyafi) {
        this.fiyafi = fiyafi;
    }


}
