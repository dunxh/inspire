package com.inspire.common.exception;

public class BaseException extends Exception {

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
