package com.example.demo.shared.api.response;

public class ErrorMessageResponse {


    private final String message;

    public ErrorMessageResponse(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

}
