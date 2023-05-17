package com.caneroksuz.oopkavramlar;

public class Calisan extends Object{

    // Fields  // Variables
    private Long kimlikNo;
    private String adi;
    private String soyadi;
    private Float maas;
    private Boolean sigorta;

    //Erişim Belirteçleri  Private, Public, Protected  ==>>  Encapsulation (Koruma)
    public Calisan() {
    }

    public Calisan(Long kimlikNo, String adi, String soyadi, Float maas, Boolean sigorta) {
        this.kimlikNo = kimlikNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.maas = maas;
        this.sigorta = sigorta;
    }

    public void setKimlikNo(Long kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public void setMaas(Float maas) {
        this.maas = maas;
    }

    public void setSigorta(Boolean sigorta) {
        this.sigorta = sigorta;
    }

     // Setter lar yoksa Sadece getter varsa .. ==>>  RO => (Read Only).. (Sadece Okuma)
    //Okuma
    public Long getKimlikNo() {
        return kimlikNo;
    }

    public String getAdi() {
        return adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public Float getMaas() {
        return maas;
    }

    public Boolean getSigorta() {
        return sigorta;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "kimlikNo=" + kimlikNo +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", maas=" + maas +
                ", sigorta=" + sigorta +
                '}';
    }


    // Sıradan bir metot
    public Float getMaasSonDurum(float asgariUcret, float bonus) {

        return asgariUcret*3 + bonus;
    }

    public Float getMaasSonDurum(float asgariUcret, float bonus,int ucretliIzin) {

        return asgariUcret*3 + bonus + ucretliIzin*14;
    }
}
