package com.myjava.wiki.domain.response;

import lombok.Data;

@Data
public class CommonResponse {
    private boolean success = true;
    private String message;

    public CommonResponse() {
    }

    public CommonResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
