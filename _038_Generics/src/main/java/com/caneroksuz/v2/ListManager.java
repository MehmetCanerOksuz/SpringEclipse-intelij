package com.caneroksuz.v2;

import java.util.ArrayList;
import java.util.List;

public class ListManager <T>{

    private List<T> benimListem = new ArrayList<>();

    public void listeyeEkle(T veri){
        this.benimListem.add(veri);
    }

    public List<T> ListeyiGetir(){
        return this.benimListem;
    }

}
