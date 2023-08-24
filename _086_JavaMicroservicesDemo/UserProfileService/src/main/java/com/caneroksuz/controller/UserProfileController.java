package com.caneroksuz.controller;

import com.caneroksuz.dto.request.UserProfileSaveRequestDto;
import com.caneroksuz.repository.entity.UserProfile;
import com.caneroksuz.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.caneroksuz.constant.EndPoints.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(USER)
public class UserProfileController {

    private final UserProfileService userProfileService;


    @PostMapping(SAVE)
    public ResponseEntity<Boolean> save(@RequestBody UserProfileSaveRequestDto dto) {
        return ResponseEntity.ok(userProfileService.saveDto(dto));
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<UserProfile>> findAll() {
        return ResponseEntity.ok(userProfileService.findAll());
    }


    @GetMapping("/hi")
    public String hi(){
        return "Hi: UserProfile Service";
    }
}
