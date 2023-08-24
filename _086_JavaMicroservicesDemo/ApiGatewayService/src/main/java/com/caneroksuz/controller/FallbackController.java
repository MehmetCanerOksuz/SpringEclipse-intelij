package com.caneroksuz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/auth")
    public String fallbackAuth(){
        return "Auth Service : Şuanda geçici olarak hizmet verememekteyiz..";
    }

    @GetMapping("/product")
    public String fallbackProduct(){
        return "Product Service : Şuanda geçici olarak hizmet verememekteyiz..";
    }
    @GetMapping("/sale")
    public String fallbackSale(){
        return "Sale Service : Şuanda geçici olarak hizmet verememekteyiz..";
    }
    @GetMapping("/user")
    public String fallbackUser(){
        return "User Service : Şuanda geçici olarak hizmet verememekteyiz..";
    }
}
