package com.caneroksuz.controller;

import com.caneroksuz.dto.request.UrunSaveRequestDto;
import com.caneroksuz.dto.response.UrunFindAllResponseDto;
import com.caneroksuz.service.UrunService;
import com.caneroksuz.constant.EndPoints;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(EndPoints.API+ EndPoints.VERSION+ EndPoints.URUN)
@RequiredArgsConstructor
public class UrunController {
    private final UrunService service;

    @PostMapping(EndPoints.SAVE)
    public ResponseEntity<Void> save(UrunSaveRequestDto dto){
        service.saveDto(dto);
        return ResponseEntity.ok().build();
    }
    @GetMapping(EndPoints.GETALL)
    public ResponseEntity<List<UrunFindAllResponseDto>> getall(){
        return ResponseEntity.ok(
                service.findAllResponseDto()
        );
    }

    // type=Not Found, status=404
    @GetMapping("/hatafirlat")
    public String hatafirlat(){
        throw new RuntimeException("Hata oluştu");
    }
}
