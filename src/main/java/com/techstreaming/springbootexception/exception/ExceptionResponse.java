package com.techstreaming.springbootexception.exception;

import lombok.Data;

@Data
public class ExceptionResponse {

    private String errorMessage;

    private String errorCOde;

    private String discription;

}
