package com.caneroksuz.model.factory.v1pojo;

public abstract class Tasima {

    
    ETasimaTipi tasimaTipi = null;

    public Tasima(ETasimaTipi tasimaTipi) {
        this.tasimaTipi = tasimaTipi;
        araIslem();
        yapilacakIslem();
    }

    private void yapilacakIslem() {
    }

    private void araIslem() {
    }

    protected abstract void hazirlikIsleminiYap();
}
