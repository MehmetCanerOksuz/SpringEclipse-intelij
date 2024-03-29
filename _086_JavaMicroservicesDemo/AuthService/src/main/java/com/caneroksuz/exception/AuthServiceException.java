package com.caneroksuz.exception;

import lombok.Getter;

@Getter
public class AuthServiceException extends RuntimeException{
    private final ErrorType type;

    public AuthServiceException(ErrorType type){
        super(type.getMessage());
        this.type=type;
    }
    public AuthServiceException(ErrorType type, String mesaj){
        super(mesaj);
        this.type=type;
    }

}
