package com.jmango.jamapi.model.res;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jmango.jamapi.model.exception.Error;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private Error error;

    public Response() {
        this(Error.OK);
    }

    public Response(Error e) {
        error = e;
    }

    public Response(int code, String message) {
        this(new Error(code, message));
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
