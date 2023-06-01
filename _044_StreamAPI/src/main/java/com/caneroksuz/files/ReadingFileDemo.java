package com.caneroksuz.files;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFileDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(new File("C:\\DOSYAADI.txt"));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);



        try {

            char c = (char) bufferedInputStream.read();
            System.out.println("Okunan veri : " + c);

        } catch (Exception e){
            System.out.println(e);
        }finally {
            bufferedInputStream.close();
        }
    }
}
