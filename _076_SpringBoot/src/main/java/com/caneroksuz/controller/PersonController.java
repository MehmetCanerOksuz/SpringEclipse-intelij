package com.caneroksuz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PersonController {

    @GetMapping
    public String getHello(){
        return "Merhaba Spring Boot Giriş Yaptık";
    }

    @GetMapping("/personel")
    public String getPersonelInfı(){
        return "Personel Bilgisi Eklendi";
    }
}
