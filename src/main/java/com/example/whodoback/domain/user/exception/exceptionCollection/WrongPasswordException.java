package com.example.whodoback.domain.user.exception.exceptionCollection;

import com.example.whodoback.global.exception.ErrorCode;
import lombok.Getter;

@Getter
public class WrongPasswordException extends RuntimeException{
    private final ErrorCode errorCode;

    public WrongPasswordException(String message){
        super(message);
        this.errorCode = ErrorCode.WRONG_PASSWORD;
    }
}
