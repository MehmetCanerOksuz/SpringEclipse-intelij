package com.caneroksuz;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TextFileReadingStreamUtf8 {

    public static void main(String[] args) {

        try {
            FileInputStream inputStream =new FileInputStream("src/main/myInput.txt");
            InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            int okumaKarakteri;

            while ((okumaKarakteri = reader.read()) != -1){
                System.out.println((char) okumaKarakteri);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("212e");


    }
}