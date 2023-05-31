package com.caneroksuz.lambda03;

public class BirParametreliOrnek {

    public static void main(String[] args) {

        MeyveSuyu meyveSuyu = new MeyveSuyu() {
            @Override
            public String getAroma(String meyveAdi) {
                return meyveAdi;
            }
        };
        System.out.println(meyveSuyu.getAroma("Armut"));


        MeyveSuyu meyveSuyu2 = meyveAdi -> meyveAdi;
        System.out.println(meyveSuyu2.getAroma("Elma"));


    }
}
