package com.caneroksuz.v3;

public class CalisanManager <BenimKendiTipim> {

    BenimKendiTipim maas;
    private String kayitNumarasi;
    String adi, soyadi;
    private final String SIRKET_ADI = "ABC";



    public String getKayitNumarasi() {
        return kayitNumarasi;
    }

    public void setKayitNumarasi(String kayitNumarasi) {
        this.kayitNumarasi = kayitNumarasi;
    }

    public String getSIRKET_ADI() {
        return SIRKET_ADI;
    }

    public String getBilgiAl(){
        return "ADI : " +adi + " Soyadi : " + soyadi + " Maas : " + maas + " Kayıt Numarası : " + kayitNumarasi;
    }
}
