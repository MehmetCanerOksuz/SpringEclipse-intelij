package com.caneroksuz.ornek;

public class Mudur extends Personel{
    private String mudurDerecesi;
    private String yoneticiDepartman;
    private String tahsisliPersonel;
    private int gorevTazminati;

    public String getMudurDerecesi() {
        return mudurDerecesi;
    }

    public void setMudurDerecesi(String mudurDerecesi) {
        this.mudurDerecesi = mudurDerecesi;
    }

    public String getYoneticiDepartman() {
        return yoneticiDepartman;
    }

    public void setYoneticiDepartman(String yoneticiDepartman) {
        this.yoneticiDepartman = yoneticiDepartman;
    }

    public String getTahsisliPersonel() {
        return tahsisliPersonel;
    }

    public void setTahsisliPersonel(String tahsisliPersonel) {
        this.tahsisliPersonel = tahsisliPersonel;
    }

    public void setGorevTazminati(int gorevTazminati) {
        this.gorevTazminati = gorevTazminati;
    }

    public int getGorevTazminati() {
        return gorevTazminati;
    }



    @Override
    public String toString() {
        return "Mudur{" +
                "mudurDerecesi='" + mudurDerecesi + '\'' +
                ", yoneticiDepartman='" + yoneticiDepartman + '\'' +
                ", tahsisliPersonel='" + tahsisliPersonel + '\'' +
                ", gorevTazminati='" + gorevTazminati + '\'' +
                '}';
    }
}
