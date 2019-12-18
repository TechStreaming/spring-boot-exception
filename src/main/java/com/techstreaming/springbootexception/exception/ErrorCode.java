package com.techstreaming.springbootexception.exception;


import lombok.Getter;

public enum ErrorCode {

    NOT_FOUND(404, "STUDENT NOT FOUND");

    @Getter
    private int responseCode;

    @Getter
    private String defaultMessage;

    ErrorCode(int responseCode, String defaultMessage) {
        this.responseCode = responseCode;
        this.defaultMessage = defaultMessage;
    }

}
