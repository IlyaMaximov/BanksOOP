package edu.phystech.response;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class ResponseWrapper<T> {

    @JsonUnwrapped
    T response;

    public ResponseWrapper(T response) {
        this.response = response;
    }
}
