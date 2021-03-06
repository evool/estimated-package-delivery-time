package com.metapack.estimatedpackagedeliverytime.persistence;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ModuleNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(ModuleNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String moduleNotFoundHandler(ModuleNotFoundException ex) {
        return ex.getMessage();
    }
}
