package com.caneroksuz;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/api/v1
//http://localhost:8080/surum1
@RestController
@RequestMapping({"/api/v1","/surum1"})
public class HelloController {

    //http://localhost:8080/api/v1/hello
    //http://localhost:8080/surum1/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello Docker";
    }

    @GetMapping("/metod2")
    public String metod2(){
        return "Metod 2-Caner";
    }

    @GetMapping("/metod3")
    public String metod3(){
        return "Metod 3-Caner Oksuz";
    }
}
