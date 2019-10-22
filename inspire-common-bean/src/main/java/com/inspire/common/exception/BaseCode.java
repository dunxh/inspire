package com.inspire.common.exception;

public enum  BaseCode {

    FAIL("0001","失败了");

    private String code;

    private String message;

    BaseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
