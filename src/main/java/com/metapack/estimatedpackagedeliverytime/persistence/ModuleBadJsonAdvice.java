package com.metapack.estimatedpackagedeliverytime.persistence;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ModuleBadJsonAdvice {

    @ResponseBody
    @ExceptionHandler(ModuleBadJsonException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String moduleBadJsonHandler(ModuleBadJsonException ex) {
        return ex.getMessage();
    }
}
