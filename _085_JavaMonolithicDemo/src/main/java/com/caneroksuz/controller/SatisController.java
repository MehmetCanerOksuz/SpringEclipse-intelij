package com.caneroksuz.controller;


import com.caneroksuz.repository.entity.Satis;
import com.caneroksuz.service.SatisService;
import com.caneroksuz.constant.EndPoints;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(EndPoints.API+ EndPoints.VERSION+ EndPoints.SATIS)
public class SatisController {
    private SatisService service;

    public SatisController(SatisService service) {
        this.service = service;
    }

    @GetMapping(EndPoints.GETALL)
    public ResponseEntity<List<Satis>> getAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping(EndPoints.SAVE)
    public ResponseEntity<Satis> save(Satis satis){
        return ResponseEntity.ok(service.save(satis));
    }

    @GetMapping("/findMaxAVMusteri")
    public ResponseEntity<String> findMaxAVMusteri(){
        return ResponseEntity.ok(service.findByMaxSatisMusteriId());
    }

    //    public List<Long> findTop3ProductName() {
    @GetMapping("/findTop3ProductName")
    public ResponseEntity<List<String>> findTop3ProductName(){
        return ResponseEntity.ok(service.findTop3ProductName());
    }

}
