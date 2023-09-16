package com.caneroksuz.exception;

import lombok.Getter;

@Getter
public class ElasticServiceException extends RuntimeException{
    private final ErrorType type;

    public ElasticServiceException(ErrorType type){
        super(type.getMessage());
        this.type=type;
    }
    public ElasticServiceException(ErrorType type, String mesaj){
        super(mesaj);
        this.type=type;
    }

}
