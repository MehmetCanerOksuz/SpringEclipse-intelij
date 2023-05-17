package com.caneroksuz.ornek;

import java.util.Arrays;

public class Hizmetli extends Personel{

    private int [] katGorevAlani;
    private String gorevTazminati;

    public int[] getKatGorevAlani() {
        return katGorevAlani;
    }

    public void setKatGorevAlani(int[] katGorevAlani) {
        this.katGorevAlani = katGorevAlani;
    }

    public String getGorevTazminati() {
        return gorevTazminati;
    }

    @Override
    public String toString() {
        return "Hizmetli{" +
                "katGorevAlani=" + Arrays.toString(katGorevAlani) +
                ", gorevTazminati='" + gorevTazminati + '\'' +
                '}';
    }

    public void setGorevTazminati(String gorevTazminati) {
        this.gorevTazminati = gorevTazminati;
    }
}
