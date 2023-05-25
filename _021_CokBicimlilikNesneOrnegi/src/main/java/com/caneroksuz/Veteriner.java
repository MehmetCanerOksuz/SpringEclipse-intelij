package com.caneroksuz;

public class Veteriner {

    public String hayvanBilgisiAl(Hayvan hayvan){

        String cevap = null;
        if (hayvan instanceof Kedi){
            cevap = "Kedi nesnesi gönderildi.";
        }else if(hayvan instanceof Kopek) {
            cevap = "Kopek nesnesi gönderildi.";
        }else if(hayvan instanceof Kus) {
            cevap = "Kus nesnesi gönderildi.";
        }

        return cevap;
    }

}
