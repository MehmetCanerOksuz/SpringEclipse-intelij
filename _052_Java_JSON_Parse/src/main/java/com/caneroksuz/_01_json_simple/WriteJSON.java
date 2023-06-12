package com.caneroksuz._01_json_simple;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON {

    public static void main(String[] args) {

        JSONObject calisanDetayi = new JSONObject();
        calisanDetayi.put("adi", "Caner");
        calisanDetayi.put("soyadi", "Oksuz");
        calisanDetayi.put("yas", 28);

        JSONObject calisanObj = new JSONObject();
        calisanObj.put("calisan.json" , calisanDetayi);

        //--------------------------------------------

        JSONObject calisanDetayi2 = new JSONObject();
        calisanDetayi2.put("adi", "Burak");
        calisanDetayi2.put("soyadi", "Delice");
        calisanDetayi2.put("yas", 33);

        JSONObject calisanObj2 = new JSONObject();
        calisanObj2.put("calisan.json" , calisanDetayi2);

        //-----------------------------------------------

        JSONArray calisanlarList = new JSONArray();
        calisanlarList.add(calisanObj);
        calisanlarList.add(calisanObj2);

        try(FileWriter file = new FileWriter("calisanlar.json")){
            file.write(calisanlarList.toJSONString());
            file.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
