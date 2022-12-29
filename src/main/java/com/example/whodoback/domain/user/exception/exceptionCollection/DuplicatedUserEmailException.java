package com.example.whodoback.domain.user.exception.exceptionCollection;

import com.example.whodoback.global.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DuplicatedUserEmailException extends RuntimeException{
    private final ErrorCode errorCode;

    public DuplicatedUserEmailException(String message){
        super(message);
        this.errorCode = ErrorCode.EMAIL_ALREADY_EXIST;
    }
}
