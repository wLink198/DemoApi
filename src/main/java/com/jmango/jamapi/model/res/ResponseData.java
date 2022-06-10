package com.jmango.jamapi.model.res;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseData<T> extends ResponseNoData {
    @JsonProperty("data")
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseData() {
    }

    public ResponseData(Boolean isSuccess) {
        super(isSuccess);
    }
}