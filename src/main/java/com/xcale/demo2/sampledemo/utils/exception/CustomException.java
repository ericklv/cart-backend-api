package com.xcale.demo2.sampledemo.utils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomException extends Exception {
    String message;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

}
