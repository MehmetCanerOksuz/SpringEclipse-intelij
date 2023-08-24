package com.caneroksuz.exception;

import lombok.Getter;

@Getter
public class UserProfileServiceException extends RuntimeException{
    private final ErrorType type;

    public UserProfileServiceException(ErrorType type){
        super(type.getMessage());
        this.type=type;
    }
    public UserProfileServiceException(ErrorType type, String mesaj){
        super(mesaj);
        this.type=type;
    }

}