package com.caneroksuz;

public class OtoGaleriException extends Exception{

    private String massage;

    public OtoGaleriException(String massage) {
        this.massage = massage;
    }

    public String getMassage() {

        return massage;
    }

    public void setMassage(String massage) {

        this.massage = massage;
    }
}
