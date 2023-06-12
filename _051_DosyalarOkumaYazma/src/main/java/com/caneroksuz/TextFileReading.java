package com.caneroksuz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReading {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("src/main/myInput.txt");
            int okumaKarakteri;

            while ((okumaKarakteri = reader.read()) != -1){
                System.out.print((char) okumaKarakteri);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("212e");
    }
}