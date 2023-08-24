package com.caneroksuz.controller;

import com.caneroksuz.dto.request.DoLoginRequestDto;
import com.caneroksuz.dto.request.DoRegisterRequestDto;
import com.caneroksuz.exception.AuthServiceException;
import com.caneroksuz.exception.ErrorType;
import com.caneroksuz.repository.entity.Auth;
import com.caneroksuz.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static com.caneroksuz.constant.EndPoints.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(AUTH)
public class AuthController {

    private final AuthService authService;


    @PostMapping(REGISTER)
    public ResponseEntity<Auth> doRegister(@RequestBody @Valid DoRegisterRequestDto dto) {

//        Auth auth = authService.save(
//                Auth.builder()
//                        .username(dto.getUsername())
//                        .email(dto.getEmail())
//                        .password(dto.getPassword())
//                        .build()
//        );
//        return ResponseEntity.ok(auth);
        if (!dto.getPassword().equals(dto.getRepassword()))
            throw new AuthServiceException(ErrorType.REGISTER_PASSWORD_MISMACTH);

        return ResponseEntity.ok(authService.doRegister(dto));
    }

    @PostMapping(LOGIN)
    public ResponseEntity<String> doLogin(@RequestBody @Valid DoLoginRequestDto dto) {
        return ResponseEntity.ok(authService.doLogin(dto));
    }

    @GetMapping("/hi")
    public String hi(){
        return "Hi: Auth Service";
    }

    /*  //Tokensiz
        @GetMapping(GETALL)
        public ResponseEntity<List<Auth>> findAll() {
            return ResponseEntity.ok(authService.findAll());
        }
    */

    //Tokenli
    @GetMapping(GETALL)
    public ResponseEntity<List<Auth>> findAll(String token) {
        return ResponseEntity.ok(authService.findAll(token));
    }

}
