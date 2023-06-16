package com.caneroksuz.model.factory.v2pojo;

public class DocumentFactory {

    public static IDocument builder(final String type){

        if(type.equalsIgnoreCase("WORD")){
            return new Word();
        }else if (type.equalsIgnoreCase("TEXT")){
            return new Text();
        } else if (type.equalsIgnoreCase("PDF")) {
            return new Pdf();
        }else {
            throw new RuntimeException("Dokuman tipi belirsiz!!.");
        }

    }
}
