package com.inspire.common.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public ErrorInfo<Object> baseErrorHandler(BaseException e) throws Exception {
        ErrorInfo<Object> r = new ErrorInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(e.getCode());
        return r;
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorInfo<Object> exceptionErrorHandler(Exception e) throws Exception {
        ErrorInfo<Object> r = new ErrorInfo<>();
        r.setMessage(BaseCode.FAIL.getMessage());
        r.setCode(BaseCode.FAIL.getCode());
        return r;
    }

}