package com.caneroksuz._01_json_simple;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadOkuJSON {

    public static void main(String[] args) {

        JSONParser jsonParser = new JSONParser();

        try(FileReader fileReader = new FileReader("calisanlar.json")) {

            Object obj = jsonParser.parse(fileReader);

            JSONArray calisanlarListesi = (JSONArray) obj;
            System.out.println(calisanlarListesi);

            calisanlarListesi.forEach(calisan -> calisanlariYazParse((JSONObject)calisan));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private static void calisanlariYazParse(JSONObject calisan) {

        JSONObject calisanObj  = (JSONObject) calisan.get("calisan.json");

        String adi = (String) calisanObj.get("adi");
        String soyadi = (String) calisanObj.get("soyadi");
        Long yas = (Long) calisanObj.get("yas");

        System.out.println(adi);
        System.out.println(soyadi);
        System.out.println(yas);
    }
}
