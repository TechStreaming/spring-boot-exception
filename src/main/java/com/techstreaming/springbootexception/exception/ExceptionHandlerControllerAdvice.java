package com.techstreaming.springbootexception.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerControllerAdvice {

    @ExceptionHandler(AppException.class)
    public ExceptionResponse handleResourceNotFound(final AppException exception) {
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setErrorCOde(String.valueOf(exception.getErrorCode().getResponseCode()));
        exceptionResponse.setErrorMessage(exception.getErrorCode().getDefaultMessage());
        exceptionResponse.setDiscription(exception.getMessage());
        return exceptionResponse;
    }
}
