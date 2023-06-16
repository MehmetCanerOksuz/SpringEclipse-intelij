package com.caneroksuz.model.factory.v2pojo;

public class AppMain {

    public static void main(String[] args) {

        /*
        IDocument iDocument1 = new Pdf();
        IDocument iDocument2 = new Text();
        IDocument iDocument3 = new Word();

        System.out.println(iDocument1.getDocumentType());
        System.out.println(iDocument2.getDocumentType());
        System.out.println(iDocument3.getDocumentType());

         */

        try{
            IDocument iDocument = DocumentFactory.builder("Word");
            System.out.println(iDocument.getDocumentType());
        }catch (Exception e){
            System.out.println("Hata : " +e);
        }


    }
}
