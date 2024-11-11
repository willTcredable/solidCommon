package com.solidmetal.response;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;

@JacksonXmlRootElement(localName = "response")
public class SolidMetalResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;
    private String message;
    protected T responseObject;

    public SolidMetalResponse() {
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResponseObject() {
        return this.responseObject;
    }

    public void setResponseObject(T responseObject) {
        this.responseObject = responseObject;
    }
}