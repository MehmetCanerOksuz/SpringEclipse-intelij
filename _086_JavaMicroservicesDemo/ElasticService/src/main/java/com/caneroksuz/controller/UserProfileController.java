package com.caneroksuz.controller;

import com.caneroksuz.dto.request.PagingRequestDto;
import com.caneroksuz.dto.request.UserProfileSaveRequestDto;
import com.caneroksuz.repository.entity.UserProfile;
import com.caneroksuz.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.caneroksuz.constant.EndPoints.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(ELASTIC+USER)
public class UserProfileController {

    private final UserProfileService userProfileService;


    //  http://localhost:9100/elastic/user/save
    @PostMapping(SAVE)
    public ResponseEntity<Void> addUser(@RequestBody UserProfileSaveRequestDto dto){
        userProfileService.saveDto(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping(GETALL)
    public ResponseEntity<Iterable<UserProfile>> findAll() {
        return ResponseEntity.ok(userProfileService.findAll());
    }

    @PostMapping(GETALLPAGE)
    public ResponseEntity<Page<UserProfile>> findAll(@RequestBody PagingRequestDto dto) {
        return ResponseEntity.ok(userProfileService.findAll(dto));
    }


    @GetMapping("/hi")
    public String hi(){
        return "Hi: UserProfile Service";
    }


    @GetMapping(GETALLVIP)
    @PreAuthorize("hasAuthority('VIP')")
    public ResponseEntity<Iterable<UserProfile>> findAllVip() {
        return ResponseEntity.ok(userProfileService.findAll());
    }

    @GetMapping(GETALLMANAGER)
    @PreAuthorize("hasAuthority('MANAGER')")
    public ResponseEntity<Iterable<UserProfile>> findAllManager() {
        return ResponseEntity.ok(userProfileService.findAll());
    }

}
