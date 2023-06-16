package com.caneroksuz.model.singleton.v1pojo;

public class Urun {

    private int id;
    private String adi;
    private float fiyafi;

    public Urun() {
    }

    public Urun(int id, String adi, float fiyafi) {
        this.id = id;
        this.adi = adi;
        this.fiyafi = fiyafi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public float getFiyafi() {
        return fiyafi;
    }

    public void setFiyafi(float fiyafi) {
        this.fiyafi = fiyafi;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", fiyafi=" + fiyafi +
                '}';
    }
}
