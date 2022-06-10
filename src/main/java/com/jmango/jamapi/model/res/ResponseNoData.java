package com.jmango.jamapi.model.res;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jmango.jamapi.model.exception.Error;

@JsonIgnoreProperties
public class ResponseNoData {
    @JsonProperty("code")
    protected Integer returnCode;
    @JsonProperty("message")
    protected String returnMsg;

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public ResponseNoData() {
    }

    public ResponseNoData(int code, String message) {
        this.returnCode = code;
        this.returnMsg = message;
    }

    public ResponseNoData(Boolean isSuccess) {
        setSuccess(isSuccess);
    }

    public void setSuccess(Boolean isSuccess) {
        if (isSuccess) {
            this.returnCode = 200;
            this.returnMsg = "Success";
        } else {
            this.returnCode = Error.UNDEFINED_ERROR;
            this.returnMsg = Error.defaultMessage();
        }
    }
}
