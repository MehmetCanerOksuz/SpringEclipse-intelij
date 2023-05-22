package com.caneroksuz;

public class Anne {

    private int kimlikNo;

    protected int boyu;
    protected String gozRengi;
    protected String sacRengi;

    boolean saglikDurumu;

    public String adi;

    public int getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(int kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getBoyu() {
        return boyu;
    }

    public void setBoyu(int boyu) {
        this.boyu = boyu;
    }

    public String getGozRengi() {
        return gozRengi;
    }

    public void setGozRengi(String gozRengi) {
        this.gozRengi = gozRengi;
    }

    public String getSacRengi() {
        return sacRengi;
    }

    public void setSacRengi(String sacRengi) {
        this.sacRengi = sacRengi;
    }

    public boolean isSaglikDurumu() {
        return saglikDurumu;
    }

    public void setSaglikDurumu(boolean saglikDurumu) {
        this.saglikDurumu = saglikDurumu;
    }

    protected void konustuguDil(){
        System.out.println("Rusça");
    }
}
