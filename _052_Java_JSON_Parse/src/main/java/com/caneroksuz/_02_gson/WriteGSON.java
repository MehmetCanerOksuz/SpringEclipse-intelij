package com.caneroksuz._02_gson;

import com.google.gson.Gson;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteGSON {

    public static void main(String[] args) {

        Calisan calisan = new Calisan();

        calisan.setCalisanId(1);
        calisan.setAdi("Aysu");
        calisan.setSoyadi("Çağışlar");
        calisan.setDepartman("Bilgi İşlem");
        calisan.setMaas(50000);

        Gson gson = new Gson();
        String jsonStr = gson.toJson(calisan);
        System.out.println(jsonStr);

        try(FileWriter file = new FileWriter("calisanlar2.json")){
            file.write(jsonStr);
            file.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

/*
        JSONObject calisanObj = new JSONObject();
        calisanObj.put("asd",calisan);

        try(FileWriter file = new FileWriter("calisanlar10.json")){
            file.write(String.valueOf(calisanObj));
            file.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


 */
    }
}