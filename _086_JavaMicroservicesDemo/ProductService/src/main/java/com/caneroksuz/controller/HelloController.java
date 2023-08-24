package com.caneroksuz.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    //http://localhost:9091
    @GetMapping
    public String hello(){
        return "Hello Product Service";
    }

    @GetMapping("/info")
    public String info(){
        return "INFO: Product Service";
    }
}
