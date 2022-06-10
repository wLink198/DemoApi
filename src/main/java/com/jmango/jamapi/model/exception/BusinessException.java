package com.jmango.jamapi.model.exception;

public class BusinessException extends RuntimeException {
    private int code;

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message != null ? message : Error.defaultMessage());
    }

    public BusinessException(int code) {
        super(Error.defaultMessage());
        this.code = code;
    }

    public BusinessException(int code, String message) {
        super(message != null ? message : Error.defaultMessage());
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
