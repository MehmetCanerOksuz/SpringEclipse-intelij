package com.caneroksuz.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
@Getter
@AllArgsConstructor
@Builder
public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String details;
}
