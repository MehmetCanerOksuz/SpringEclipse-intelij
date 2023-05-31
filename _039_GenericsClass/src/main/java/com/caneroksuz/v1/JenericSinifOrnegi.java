package com.caneroksuz.v1;

public class JenericSinifOrnegi <T>{
    T nesne;

    public JenericSinifOrnegi() {
    }

    public JenericSinifOrnegi(T nesne) {
        this.nesne = nesne;
    }

    public T getNesne() {
        return nesne;
    }

    public void setNesne(T nesne) {
        this.nesne = nesne;
    }

    @Override
    public String toString() {
        return "JenericSinifOrnegi{" +
                "nesne=" + nesne +
                '}';
    }
}
