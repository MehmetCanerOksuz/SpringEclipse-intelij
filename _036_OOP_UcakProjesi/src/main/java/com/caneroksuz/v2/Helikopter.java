package com.caneroksuz.v2;

public class Helikopter extends HavaAraci{

    float ustPervane;
    float arkaPervade;

    public void manevra(){
        System.out.println("Manevra yeteneği");
    }

    public Helikopter() {
    }

    public Helikopter(float uzunluk, float yukseklik, int hiz, float agirlik,
                      boolean havadaMi, float ustPervane, float arkaPervade) {
        super(uzunluk, yukseklik, hiz, agirlik, havadaMi);
        this.ustPervane = ustPervane;
        this.arkaPervade = arkaPervade;
    }

    @Override
    public String toString() {
        return "Helikopter{" +
                "ustPervane=" + ustPervane +
                ", arkaPervade=" + arkaPervade +
                ", uzunluk=" + uzunluk +
                ", yukseklik=" + yukseklik +
                ", hiz=" + hiz +
                ", agirlik=" + agirlik +
                ", havadaMi=" + havadaMi +
                '}';
    }
}
